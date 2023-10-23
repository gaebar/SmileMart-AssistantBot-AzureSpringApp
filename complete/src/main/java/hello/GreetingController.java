package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


@RestController
public class GreetingController {

    @Value("${chatbot.apikey}")
    private String apikey;


    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }


    @GetMapping("/get-chatbot-token")
    public ObjectNode sayHello() throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL("https://webchat.botframework.com/api/tokens").openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "BotConnector " + apikey);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String output;

        StringBuffer response = new StringBuffer();
        while ((output = in.readLine()) != null) {
            response.append(output);
        }
        in.close();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("key", response.toString());
        return objectNode;
    }
}
