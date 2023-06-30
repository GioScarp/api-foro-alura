package gio.apiforoalura.repositories;

import gio.apiforoalura.models.StatusTopic;
import gio.apiforoalura.models.Topic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {

    Page<Topic> findByStatusNotIn(Pageable pageable, List<StatusTopic> status);

}
