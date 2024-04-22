package capstone.capstone.gemini;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class GeminiConfiguration {
    @Bean
    public VertexAI vertexAI() throws IOException {
        return new VertexAI("metal-music-419112","us-central1");
    }

    @Bean
    public GenerativeModel generativeModel(VertexAI vertexAI){
        return new GenerativeModel("gemini-pro-vision",vertexAI);
    }
}
