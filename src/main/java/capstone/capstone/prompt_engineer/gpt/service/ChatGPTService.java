//package capstone.capstone.gpt.service;
//
//import capstone.capstone.gpt.dto.ChatCompletionDto;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * ChatGPT 서비스 인터페이스
// *
// * @author : lee
// * @fileName : ChatGPTService
// * @since : 12/29/23
// */
//
//@Service
//public interface ChatGPTService {
//
//    List<Map<String, Object>> modelList();
//
//    Map<String, Object> isValidModel(String modelName);
//
//    Map<String, Object> legacyPrompt(ChatCompletionDto completionDto);
//
//    Map<String, Object> prompt(ChatCompletionDto chatCompletionDto);
//}