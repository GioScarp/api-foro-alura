package gio.apiforoalura.domain.topico;

import gio.apiforoalura.domain.curso.Course;
import gio.apiforoalura.domain.usuario.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String title;
    @Column(unique = true)
    private String message;
    @CreationTimestamp
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    //@Column(name = "status", columnDefinition = "VARCHAR(40) DEFAULT 'NO_RESPONDIDO'")
    @Enumerated(EnumType.STRING)
    private StatusTopic status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    public Topic(DTORegistroTopic registroTopico, User user, Course course){
        this.title = registroTopico.title();
        this.message = registroTopico.message();
        this.user = user;
        this.course = course;
        this.status = StatusTopic.NO_RESPONDIDO;
    }

    public void actualizarDatos(DTOActualizarTopic dtoActualizarTopic) {
        if (dtoActualizarTopic.title() != null && !dtoActualizarTopic.title().isEmpty()){
            this.title = dtoActualizarTopic.title();
        }
        if (dtoActualizarTopic.message() != null && !dtoActualizarTopic.message().isEmpty()){
            this.message = dtoActualizarTopic.message();
        }
    }

    public void actualizarStatus(StatusTopic status) {
        this.status = StatusTopic.CERRADO;
    }
}
