package gettoken;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@RestController
public class GetTokenController {

    @Value("${chatbot.apikey}")
    private String chatBotApiKey;

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

    @PostMapping("/get-chatbot-token")
    @CrossOrigin(origins = {"http://localhost:8080", "http://localhost:8000", "https://gaebar.github.io"})
    public ObjectNode getChatBotToken() throws IOException {
        HttpURLConnection con = (HttpURLConnection) new URL("https://webchat.botframework.com/api/tokens").openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Authorization", "BotConnector " + chatBotApiKey);

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
