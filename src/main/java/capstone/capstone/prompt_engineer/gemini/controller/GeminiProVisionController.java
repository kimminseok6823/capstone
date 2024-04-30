package capstone.capstone.prompt_engineer.gemini.controller;

//import com.google.cloud.vertexai.api.GenerateContentRequest;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import com.google.cloud.vertexai.generativeai.PartMaker;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.ContentMaker;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.PartMaker;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/gemini-pro-vision")
public class GeminiProVisionController {

    private final GenerativeModel generativeModel;

    public GeminiProVisionController(@Qualifier("geminiProVisionGenerativeModel") GenerativeModel generativeModel) {
        this.generativeModel = generativeModel;
    }

//    @PostMapping
//    public String file(@RequestParam("file") MultipartFile file,@RequestParam String question) throws IOException {
//        GenerateContentResponse generateContentResponse = this.generativeModel.generateContent(
//                ContentMaker.fromMultiModalData(
//                        PartMaker.fromMimeTypeAndData(file.getContentType(),file.getBytes()),
//                        question
//                )
//        );
//        return ResponseHandler.getText(generateContentResponse);
//    }
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
