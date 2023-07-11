package gio.apiforoalura.controllers;

import gio.apiforoalura.dto.UserDto;
import gio.apiforoalura.dto.UserUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import gio.apiforoalura.services.UserService;
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
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/")
    public ResponseEntity<Long> saveUser(@RequestBody UserDto userDto, UriComponentsBuilder uriComponentsBuilder) throws ObjectValidationException {
        Long idTopic = userService.save(userDto);
        URI url = uriComponentsBuilder.path("/api/users/{id}").buildAndExpand(idTopic).toUri();
        return ResponseEntity.created(url).body(idTopic);
    }

    @GetMapping("/")
    public ResponseEntity<Page<UserDto>> findAllUsers(@PageableDefault(size = 15) Pageable pageable){
        return ResponseEntity.ok(userService.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findByIdUser(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<UserDto> updateUser(@PathVariable Long id, @RequestBody UserUpdateDto userDto ) throws ObjectValidationException {
        return ResponseEntity.ok(userService.updateUser(id, userDto));
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}
