package gio.apiforoalura.services;

import gio.apiforoalura.dto.LightTopicResponseDto;
import gio.apiforoalura.dto.ResponseDto;
import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.dto.TopicUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TopicService extends AbstractService<TopicDto>{

    TopicDto updateTopic(Long id, TopicUpdateDto updateTopic) throws ObjectValidationException;

    ResponseDto addResponse(Long id, ResponseDto response) throws ObjectValidationException;

    Page<LightTopicResponseDto> findAllLight(Pageable pageable);
}
