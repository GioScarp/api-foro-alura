package gio.apiforoalura.repositories;

import gio.apiforoalura.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findByisActive(Pageable pageable, Boolean isActive);
    Optional<User> findByUserName(String userName);
}
