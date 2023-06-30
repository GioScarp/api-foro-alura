package gio.apiforoalura.mapper;

import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.models.Course;
import gio.apiforoalura.models.StatusTopic;
import gio.apiforoalura.models.Topic;
import gio.apiforoalura.models.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TopicMapper {
    public static TopicDto toTopicResponseDto(Topic topic){
        return TopicDto.builder()
                .title(topic.getTitle())
                .message(topic.getMessage())
                .statusTopic(topic.getStatus())
                .user(topic.getUser().getId())
                .course(topic.getCourse().getId())
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
