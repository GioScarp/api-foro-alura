package gio.apiforoalura.services.impl;

import gio.apiforoalura.dto.UserDto;
import gio.apiforoalura.dto.UserUpdateDto;
import gio.apiforoalura.infra.exceptions.ObjectValidationException;
import gio.apiforoalura.infra.validators.ObjectsValidator;
import gio.apiforoalura.mapper.UserMapper;
import gio.apiforoalura.models.User;
import gio.apiforoalura.repositories.UserRepository;
import gio.apiforoalura.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    public static final String USER_ID_NOT_FOUND = "No se ha encontrado un usuario con este id";
    private final UserRepository userRepository;
    private final ObjectsValidator<UserDto> validator;
    private final ObjectsValidator<UserUpdateDto> validatorUpdate;

    @Override
    public Long save(UserDto userDto) throws ObjectValidationException {
        validator.validate(userDto);
        User user = userRepository.save(UserMapper.toEntity(userDto));
        return user.getId();
    }

    @Override
    public Page<UserDto> findAll(Pageable pageable) {
        return userRepository.findByisActive(pageable, true).map(UserMapper::toUserResponseDto);
    }

    @Override
    public UserDto findById(Long id) {
        return UserMapper.toUserResponseDto(userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(USER_ID_NOT_FOUND)));
    }

    @Override
    public UserDto updateUser(Long id , UserUpdateDto userDto) throws ObjectValidationException {
        validatorUpdate.validate(userDto);
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(USER_ID_NOT_FOUND));

        updateDataUser(user, userDto);

        //return UserMapper.toUserRespuestaDto(userRepository.saveAndFlush(user));
        return UserMapper.toUserResponseDto(user);
    }

    private void updateDataUser(User user, UserUpdateDto userDto) {
        user.setUserName(userDto.userName());
        user.setEmail(userDto.email());

        //userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(USER_ID_NOT_FOUND));
        user.setIsActive(false);
    }

}
