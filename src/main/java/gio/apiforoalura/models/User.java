package gio.apiforoalura.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
public class User extends AbstractEntity{

    @Column(name = "user_name")
    private String userName;

    private String email;

    private String password;

    @Column(name = "active")
    private boolean isActive;

}
