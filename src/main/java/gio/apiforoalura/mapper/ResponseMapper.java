package gio.apiforoalura.mapper;

import gio.apiforoalura.dto.ResponseDto;
import gio.apiforoalura.models.Response;
import gio.apiforoalura.models.Topic;
import gio.apiforoalura.models.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResponseMapper {

    public static ResponseDto toResponseDto(Response response){
        return ResponseDto.builder()
                .message(response.getMessage())
                .solution(response.isSolution())
                .user(response.getUser().getId())
                .createBy(response.getUser().getUsername())
                .lastModified(response.getLastModifiedDate())
                .build();
    }

    public static Response toEntityResponse(Long id , ResponseDto responseDto){
        return Response.builder()
                .message(responseDto.message())
                .solution(false)
                .user(User.builder()
                        .id(responseDto.user())
                        .build())
                .topic(Topic.builder()
                        .id(id)
                        .build())
                .build();

    }
}
