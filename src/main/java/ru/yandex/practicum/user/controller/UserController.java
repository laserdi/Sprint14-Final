package ru.yandex.practicum.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.user.dto.UserDto;
import ru.yandex.practicum.user.service.UserService;
import ru.yandex.practicum.validation.CreateObject;
import ru.yandex.practicum.validation.UpdateObject;
import ru.yandex.practicum.validation.ValidationService;

import java.util.List;

@RestController
@RequestMapping("users")
@Slf4j
@RequiredArgsConstructor
@Validated
public class UserController {
    private final UserService service;
    private final ValidationService validationService;

    /**
     * Добавить юзера в БД.
     * @param userDto пользователь.
     * @return добавляемый пользователь.
     */
    @PostMapping
    ResponseEntity<UserDto> addToStorage(@RequestBody @Validated(CreateObject.class) UserDto userDto) {

        UserDto createdUser = service.addToStorage(userDto);
        ResponseEntity<UserDto> response = new ResponseEntity<>(
                createdUser, HttpStatus.CREATED);
        String message = String.format("В БД добавлен новый пользователь:\t%s", response.getBody());
        log.info(message);
        return response;
    }

    /**
     * Обновить юзера в БД.
     * @param userDto пользователь
     * @param userId  ID обновляемого пользователя.
     * @return обновлённый пользователь.
     */
    @PatchMapping("/{userId}")
    UserDto updateInStorage(@PathVariable long userId,
                            @Validated({UpdateObject.class}) @RequestBody UserDto userDto) {
        userDto.setId(userId);
        UserDto updatedUserDto = service.updateInStorage(userDto);
        log.info("Выполнено обновление пользователя в БД.");
        return updatedUserDto;
    }

    /**
     * Удалить пользователя из БД.
     * @param userId ID удаляемого пользователя.
     */
    @DeleteMapping("/{userId}")
    ResponseEntity<String> removeFromStorage(@PathVariable Long userId) {
        service.removeFromStorage(userId);
        String message = String.format("Выполнено удаление пользователя с ID = %d.", userId);
        log.info(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    /**
     * Получить список всех пользователей.
     * @return список пользователей.
     */
    @GetMapping
    ResponseEntity<List<UserDto>> getAllUsersFromStorage() {
        List<UserDto> allUsersDto = service.getAllUsers();

        ResponseEntity<List<UserDto>> response = new ResponseEntity<>(allUsersDto, HttpStatus.OK);
        log.info("Выдан список всех пользователей.");
        return response;
    }

    /**
     * Получить пользователя по ID.
     * @param userId ID пользователя.
     * @return User - пользователь присутствует в библиотеке.
     * <p>null - пользователя нет в библиотеке.</p>
     */
    @GetMapping("/{userId}")
    public UserDto getUserById(@PathVariable Long userId) {
        return service.getUserById(userId);
    }
}
