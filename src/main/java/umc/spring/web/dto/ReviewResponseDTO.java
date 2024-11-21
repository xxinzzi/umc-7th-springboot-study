package umc.spring.web.dto;

import lombok.*;

import java.time.LocalDateTime;

public class ReviewResponseDTO {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddReviewToStoreResultDto{
        Long reviewId;
        LocalDateTime createdAt;
    }
}
