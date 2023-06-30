package gio.apiforoalura.services;

import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.dto.TopicUpdateDto;

public interface TopicService extends AbstractService<TopicDto>{

    TopicDto updateTopic(Long id, TopicUpdateDto updateTopic);

}
