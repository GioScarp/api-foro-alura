package gio.apiforoalura.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class Course extends AbstractEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 7843610247249103089L;

    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Builder.Default
    @Column(name = "active")
    private Boolean isActive = true;
}
