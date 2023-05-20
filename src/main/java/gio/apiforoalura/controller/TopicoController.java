package gio.apiforoalura.controller;

import gio.apiforoalura.domain.curso.Course;
import gio.apiforoalura.domain.curso.CourseRepository;
import gio.apiforoalura.domain.curso.DTOListadoCourses;
import gio.apiforoalura.domain.topico.*;
import gio.apiforoalura.domain.usuario.DatosListadoUsers;
import gio.apiforoalura.domain.usuario.User;
import gio.apiforoalura.domain.usuario.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/topicos")
public class TopicoController {

    @Autowired
    private CourseRepository cursoRepository;

    @Autowired
    private UserRepository usuarioRepository;

    @Autowired
    private TopicRepository topicoRepository;

//    private final UsuarioRepository usuarioRepository;
//
//    public TopicoController(UsuarioRepository usuarioRepository) {
//        this.usuarioRepository = usuarioRepository;
//    }

    @PostMapping()
    public ResponseEntity<DTORespuestaTopic> registroTopico(@RequestBody @Valid DTORegistroTopic registroTopico, UriComponentsBuilder uriComponentsBuilder){
        User usuario = usuarioRepository.getReferenceById(registroTopico.user());
        Course curso = cursoRepository.getReferenceById(registroTopico.course());
        Topic topico = topicoRepository.save(new Topic(registroTopico, usuario, curso));
        URI url = uriComponentsBuilder.path("/api/topicos/{id}").buildAndExpand(topico.getId()).toUri();
        return ResponseEntity.created(url).body(new DTORespuestaTopic(topico));
    }

    @GetMapping("/usuarios")
    public List<DatosListadoUsers> obtenerUsuario(){
        return usuarioRepository.findAll().stream().map(DatosListadoUsers::new).toList();
    }

    @GetMapping("/cor")
    public List<DTOListadoCourses> obtenerCourses(){
        return cursoRepository.findAll().stream().map(DTOListadoCourses::new).toList();
    }

    @GetMapping
    public ResponseEntity<Page<DTODatosTopico>> listadoTopicos(@PageableDefault(size = 5) Pageable pageable){
        return ResponseEntity.ok(topicoRepository.findAll(pageable).map(DTODatosTopico::new));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DTODatosTopico> datosTopico(@PathVariable Long id){
        Topic topico = topicoRepository.getReferenceById(id);
        return ResponseEntity.ok(new DTODatosTopico(topico));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<DTORespuestaTopic> actualizarTopico(@PathVariable Long id, @RequestBody @Valid DTOActualizarTopic dtoActualizarTopic){
        Topic topic = topicoRepository.getReferenceById(id);
        topic.actualizarDatos(dtoActualizarTopic);
        return ResponseEntity.ok(new DTORespuestaTopic(topic));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> eliminarTopico(@PathVariable Long id){
        Topic topico = topicoRepository.getReferenceById(id);
        topico.actualizarStatus(StatusTopic.CERRADO);
        return ResponseEntity.noContent().build();
    }
}
