package gio.apiforoalura.controller;

import gio.apiforoalura.domain.curso.Course;
import gio.apiforoalura.domain.curso.CourseRepository;
import gio.apiforoalura.domain.curso.DTOListadoCourses;
import gio.apiforoalura.domain.topico.*;
import gio.apiforoalura.domain.usuario.DatosListadoUsers;
import gio.apiforoalura.domain.usuario.User;
import gio.apiforoalura.domain.usuario.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println(registroTopico.user() +"/"+ registroTopico.course());
        User usuario = usuarioRepository.getReferenceById(registroTopico.user());
        Course curso = cursoRepository.getReferenceById(registroTopico.course());
        System.out.println(registroTopico.title());
        Topic topico = topicoRepository.save(new Topic(registroTopico, usuario, curso));
        URI url = uriComponentsBuilder.path("/{id}").buildAndExpand(topico.getId()).toUri();
        DTORespuestaTopic respuestaTopico = new DTORespuestaTopic(topico);
        return ResponseEntity.created(url).body(respuestaTopico);
    }

    @GetMapping
    public List<DatosListadoUsers> obtenerUsuario(){
        return usuarioRepository.findAll().stream().map(DatosListadoUsers::new).toList();
    }

    @GetMapping("/cor")
    public List<DTOListadoCourses> obtenerCourses(){
        return cursoRepository.findAll().stream().map(DTOListadoCourses::new).toList();
    }
}
