package ru.yandex.practicum.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yandex.practicum.user.model.User;

public interface UserRepositoryJpa extends JpaRepository<User, Long> {
}
