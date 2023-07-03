package gio.apiforoalura.mapper;

import gio.apiforoalura.dto.UserDto;
import gio.apiforoalura.models.User;

public class UserMapper {
    public static UserDto toUserRespuestaDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .userName(user.getUserName())
                .email(user.getEmail())
                .build();
    }

    public static User toEntity(UserDto user){
        return User.builder()
                .userName(user.userName())
                .email(user.email())
                .password(user.password())
                .build();
    }
}
