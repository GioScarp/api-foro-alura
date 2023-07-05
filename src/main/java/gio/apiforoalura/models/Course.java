package gio.apiforoalura.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(of = "id")
public class Course extends AbstractEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "active")
    private boolean isActive;
}
