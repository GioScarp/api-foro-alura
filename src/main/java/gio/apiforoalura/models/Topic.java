package gio.apiforoalura.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "topics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Topic extends AbstractEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1985693254717212585L;

    @Column(unique = true)
    private String title;

    @Column(unique = true)
    private String message;

    @Enumerated(EnumType.STRING)
    private StatusTopic status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;
}
