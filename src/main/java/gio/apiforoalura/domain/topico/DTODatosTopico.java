package gio.apiforoalura.domain.topico;

import java.time.LocalDateTime;

public record DTODatosTopico(
        Long id,
        String title,
        String message,
        LocalDateTime creationDate,
        String status,
        String userName,
        String curso) {

    public DTODatosTopico(Topic topic){
        this(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreationDate(),
                topic.getStatus().toString(),topic.getUser().getUserName(), topic.getCourse().getName());
    }
}
