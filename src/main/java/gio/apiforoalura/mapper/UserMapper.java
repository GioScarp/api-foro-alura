package gio.apiforoalura.mapper;

import gio.apiforoalura.dto.UserDto;
import gio.apiforoalura.models.Role;
import gio.apiforoalura.models.User;

public class UserMapper {
    public static UserDto toUserResponseDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .userName(user.getUsername())
                .email(user.getEmail())
                .build();
    }

    public static User toEntity(UserDto user){
        return User.builder()
                .userName(user.userName())
                .fristname(user.fristname())
                .lastname(user.lastname())
                .email(user.email())
                .password(user.password())
                .role(Role.USER)
                .build();
    }
}
