package gio.apiforoalura.services.impl;

import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.dto.TopicUpdateDto;
import gio.apiforoalura.infra.validators.ObjectsValidator;
import gio.apiforoalura.mapper.TopicMapper;
import gio.apiforoalura.models.StatusTopic;
import gio.apiforoalura.models.Topic;
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
    private final ObjectsValidator<TopicDto> validator;
    private final ObjectsValidator<TopicUpdateDto> validatorUpdate;

    @Override
    public Long save(TopicDto dto) {
        validator.validate(dto);
        Topic topic = TopicMapper.toEntity(dto);
        return topicRepository.save(topic).getId();
    }

    @Override
    public Page<TopicDto> findAll(Pageable pageable) {
        return topicRepository.findByStatusNotIn(pageable, List.of(StatusTopic.CERRADO))
                .map(TopicMapper::toTopicResponseDto);
    }

    @Override
    public TopicDto findById(Long id) {
        return TopicMapper.toTopicResponseDto(topicRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(TOPIC_NOT_FOUND + id)));
    }

    @Override
    public void delete(Long id) {
        topicRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(TOPIC_NOT_FOUND + id))
                .setStatus(StatusTopic.CERRADO);
    }

    @Override
    public TopicDto updateTopic(Long id, TopicUpdateDto updateTopic) {
        validatorUpdate.validate(updateTopic);
        final Topic topic = topicRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(TOPIC_NOT_FOUND + id));
        updateData(topic, updateTopic);
        return TopicMapper.toTopicResponseDto(topic);
    }

    public void updateData(Topic topic, TopicUpdateDto dtoActualizarTopic) {
            topic.setTitle(dtoActualizarTopic.title());
            topic.setMessage(dtoActualizarTopic.message());
    }
}
