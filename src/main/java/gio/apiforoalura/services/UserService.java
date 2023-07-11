package gio.apiforoalura.services;

import gio.apiforoalura.dto.UserDto;
import gio.apiforoalura.dto.UserUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;

public interface UserService extends AbstractService<UserDto>{
    UserDto updateUser(Long id, UserUpdateDto user) throws ObjectValidationException;
}
