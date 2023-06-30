package gio.apiforoalura.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AbstractService<T> {
    Long save(T dto);

    Page<T> findAll(Pageable pageable);

    T findById(Long id);

    void delete(Long id);
}
