package umc.spring.converter;

import umc.spring.domain.User;
import umc.spring.domain.enums.Gender;
import umc.spring.web.dto.UserResponseDTO;
import umc.spring.web.dto.UserRequestDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class UserConverter {
    public static UserResponseDTO.JoinResultDTO toJoinResultDTO(User user){
        return UserResponseDTO.JoinResultDTO.builder()
                .userId(user.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static User toUser(UserRequestDTO.JoinDto request){

        Gender gender = switch (request.getGender()) {
            case 1 -> Gender.MALE;
            case 2 -> Gender.FEMALE;
            default -> Gender.NONE;
        };


        return User.builder()
                .address(request.getAddress())
                .addressSpec(request.getAddressSpec())
                .gender(gender)
                .birth(request.getBirth())
                .name(request.getName())
                .userPreferList(new ArrayList<>()) //초기화
                .build();
    }
}