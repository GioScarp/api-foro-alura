package gio.apiforoalura.controllers;

import gio.apiforoalura.dto.AuthenticationRequest;
import gio.apiforoalura.dto.AuthenticationResponse;
import gio.apiforoalura.dto.UserDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import gio.apiforoalura.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthenticationController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody UserDto userDto) throws ObjectValidationException {
        return ResponseEntity.ok((userService.register(userDto)));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authRequest){
        return ResponseEntity.ok(userService.authenticate(authRequest));
    }
}
