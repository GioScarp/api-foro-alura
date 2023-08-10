package gio.apiforoalura.controllers;

import gio.apiforoalura.dto.LightTopicResponseDto;
import gio.apiforoalura.dto.ResponseDto;
import gio.apiforoalura.dto.TopicDto;
import gio.apiforoalura.dto.TopicUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import gio.apiforoalura.services.TopicService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/topics")
@RequiredArgsConstructor
public class TopicoController {

    private final TopicService topicService;

    @PostMapping("/")
    public ResponseEntity<Long> saveTopic(@RequestBody TopicDto topicDto, UriComponentsBuilder uriComponentsBuilder) throws ObjectValidationException {
        Long idTopic = topicService.save(topicDto);
        URI url = uriComponentsBuilder.path("/api/topics/{id}").buildAndExpand(idTopic).toUri();
        return ResponseEntity.created(url).body(idTopic);
    }

    @GetMapping("/")
    public ResponseEntity<Page<LightTopicResponseDto>> findAllTopics(
            @PageableDefault(size = 15) Pageable pageable){
        return ResponseEntity.ok(topicService.findAllLight(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TopicDto> findByIdTopic(@PathVariable Long id){
        return ResponseEntity.ok(topicService.findById(id));
    }

    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<ResponseDto> addResponseToTopic(@PathVariable Long id, @RequestBody ResponseDto response) throws ObjectValidationException {
        return ResponseEntity.ok().body(topicService.addResponse(id, response));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TopicDto> updateTopico(@PathVariable Long id, @RequestBody TopicUpdateDto updateTopic) throws ObjectValidationException {
        return ResponseEntity.ok(topicService.updateTopic(id, updateTopic));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id){
        topicService.delete(id);
        return ResponseEntity.ok().build();
    }
}
