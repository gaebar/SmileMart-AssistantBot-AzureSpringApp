package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@RestController
public class GreetingController {

    @Value("${chatbot.apikey}")
    private String apikey1;

    @Value("#{environment.CHATBOT_API_KEY}")
    private String apikey2;

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @GetMapping("/get-chatbot-token")
    @CrossOrigin(origins = {"http://localhost:8080", "https://gaebar.github.io"})
    public ObjectNode sayHello() throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL("https://webchat.botframework.com/api/tokens").openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "BotConnector " + apikey1);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String output;

        StringBuilder response = new StringBuilder();
        while ((output = in.readLine()) != null) {
            response.append(output.replace("\"", ""));
        }
        in.close();
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("key", response.toString());
        return objectNode;
    }
}
