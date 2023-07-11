package gio.apiforoalura.services;

import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.dto.TopicUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;

public interface TopicService extends AbstractService<TopicDto>{

    TopicDto updateTopic(Long id, TopicUpdateDto updateTopic) throws ObjectValidationException;

}
