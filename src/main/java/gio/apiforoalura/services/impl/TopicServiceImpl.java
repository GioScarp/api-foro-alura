package gio.apiforoalura.services.impl;

import gio.apiforoalura.dto.LightTopicResponseDto;
import gio.apiforoalura.dto.ResponseDto;
import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.dto.TopicUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import gio.apiforoalura.infra.validators.ObjectsValidator;
import gio.apiforoalura.mapper.ResponseMapper;
import gio.apiforoalura.mapper.TopicMapper;
import gio.apiforoalura.models.Response;
import gio.apiforoalura.models.StatusTopic;
import gio.apiforoalura.models.Topic;
import gio.apiforoalura.repositories.ResponseRepository;
import gio.apiforoalura.repositories.TopicRepository;
import gio.apiforoalura.services.TopicService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicServiceImpl implements TopicService {

    public static final String TOPIC_NOT_FOUND = "No se encontró el topico con el id: ";
    private final TopicRepository topicRepository;
    private final ResponseRepository responseRepository;
    private final ObjectsValidator<TopicDto> validator;
    private final ObjectsValidator<TopicUpdateDto> validatorUpdate;
    private final ObjectsValidator<ResponseDto> validatorResponse;

    @Override
    public Long save(TopicDto topicDto) throws ObjectValidationException {
        validator.validate(topicDto);
        return topicRepository.save(TopicMapper.toEntity(topicDto)).getId();
    }

    @Override
    public Page<TopicDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public TopicDto findById(Long id) {
        return TopicMapper.toFullTopicResponseDto(topicRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(TOPIC_NOT_FOUND + id)));
    }

    @Override
    public void delete(Long id) {
        topicRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(TOPIC_NOT_FOUND + id))
                .setStatus(StatusTopic.CERRADO);
    }

    @Override
    public TopicDto updateTopic(Long id, TopicUpdateDto updateTopic) throws ObjectValidationException {
        validatorUpdate.validate(updateTopic);
        final Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(TOPIC_NOT_FOUND + id));
        updateData(topic, updateTopic);
        return TopicMapper.toFullTopicResponseDto(topic);
    }

    @Override
    public ResponseDto addResponse(Long id, ResponseDto responseDto) throws ObjectValidationException {
        validatorResponse.validate(responseDto);
        Response response = responseRepository.saveAndFlush(ResponseMapper.toEntityResponse(id, responseDto));
        System.out.println(response.getUser().getUsername());
        return ResponseMapper.toResponseDto(response);
    }
    //TODO retornar solo un mensaje de exito

    @Override
    public Page<LightTopicResponseDto> findAllLight(Pageable pageable) {
        return topicRepository.findByStatusNotIn(pageable, List.of(StatusTopic.CERRADO))
                .map(TopicMapper::toLightTopicResponse);
    }

    public void updateData(Topic topic, TopicUpdateDto dtoActualizarTopic) {
            topic.setTitle(dtoActualizarTopic.title());
            topic.setMessage(dtoActualizarTopic.message());
    }
}
