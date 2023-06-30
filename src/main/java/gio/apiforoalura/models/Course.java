package gio.apiforoalura.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@SuperBuilder
@EqualsAndHashCode(of = "id")
public class Course extends AbstractEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name = "active")
    private boolean isActive;
}
