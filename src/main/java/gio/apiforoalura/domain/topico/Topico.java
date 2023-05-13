package gio.apiforoalura.domain.topico;

import gio.apiforoalura.domain.curso.Curso;
import gio.apiforoalura.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    @CreationTimestamp
    private LocalDateTime creation_date;
    @Enumerated(EnumType.STRING)
    private StatusTopic status;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario author;
    @ManyToOne(fetch = FetchType.LAZY)
    private Curso course;

}
