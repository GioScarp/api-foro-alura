package gio.apiforoalura.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    @Builder.Default
    @Column(name = "active")
    private Boolean isActive = true;

}
