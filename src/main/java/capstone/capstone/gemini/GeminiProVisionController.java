package capstone.capstone.gemini;

import com.google.cloud.vertexai.api.GenerateContentRequest;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ContentMaker;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.PartMaker;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/gemini-pro-vision")
@RequiredArgsConstructor
public class GeminiProVisionController {

    private final GenerativeModel generativeModel;

    @PostMapping
    public ResponseEntity<String> processRequest(@RequestBody String question) throws IOException {
        GenerateContentResponse generateContentResponse = this.generativeModel.generateContent(
                ContentMaker.fromMultiModalData(
                        question
                )
        );
        String responseText = ResponseHandler.getText(generateContentResponse);
        return ResponseEntity.status(HttpStatus.OK).body(responseText);
    }
}
