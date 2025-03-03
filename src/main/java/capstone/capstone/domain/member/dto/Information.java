package capstone.capstone.domain.member.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Information {
    private String memberId;
    @Size(max = 22)
    private String introduce;
    private String job;
    private String specificDuty;
    private String link;
    private Set<String> technics;
    private String imageUrl;
    private String openChatting;
}
