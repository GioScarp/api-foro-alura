package gio.apiforoalura.services;

import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AbstractService<T> {
    Long save(T dto) throws ObjectValidationException;

    Page<T> findAll(Pageable pageable);

    T findById(Long id);

    void delete(Long id);
}
