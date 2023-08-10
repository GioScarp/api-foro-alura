package gio.apiforoalura.repositories;

import gio.apiforoalura.models.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Long> {
}
