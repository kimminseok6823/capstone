package capstone.capstone.prompt_engineer.gemini.controller;

import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ChatSession;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatSession chatSession;

    @GetMapping("/{text}")
    public ResponseEntity<Map<String, String>> chat(@PathVariable String text) throws IOException {
        GenerateContentResponse generateContentResponse = this.chatSession.sendMessage(text);
        String responseText = ResponseHandler.getText(generateContentResponse);

        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("resp", responseText);

        return new ResponseEntity<>(responseMap, HttpStatus.OK);
    }

}
