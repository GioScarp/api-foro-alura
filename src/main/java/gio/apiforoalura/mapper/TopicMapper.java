package gio.apiforoalura.mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import gio.apiforoalura.dto.LightTopicResponseDto;
import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.models.Course;
import gio.apiforoalura.models.StatusTopic;
import gio.apiforoalura.models.Topic;
import gio.apiforoalura.models.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TopicMapper {
    public static TopicDto toFullTopicResponseDto(Topic topic){
        return TopicDto.builder()
                .title(topic.getTitle())
                .message(topic.getMessage())
                .statusTopic(topic.getStatus())
                .numResponses(topic.getResponses().size())
                .user(topic.getUser().getId())
                .course(topic.getCourse().getId())
                .createBy(topic.getUser().getUsername())
                .lastlastModifiedDate(topic.getLastModifiedDate())
                .respuestas(topic.getResponses().stream().map(ResponseMapper::toResponseDto).toList())
                .build();
    }

    public static LightTopicResponseDto toLightTopicResponse(Topic topic){
        return LightTopicResponseDto.builder()
                .title(topic.getTitle())
                .createBy(topic.getUser().getUsername())
                .numResponses(topic.getResponses().size())
                .statusTopic(topic.getStatus())
                .lastlastModifiedDate(topic.getLastModifiedDate())
                .build();
    }

    public static Topic toEntity(TopicDto topicDto){
        return Topic.builder()
                .title(topicDto.title())
                .message(topicDto.message())
                .status(StatusTopic.NO_RESPONDIDO)
                .user(
                        User.builder()
                                .id(topicDto.user())
                                .build()
                )
                .course(
                        Course.builder()
                                .id(topicDto.course())
                                .build()
                )
                .build();
    }
}
