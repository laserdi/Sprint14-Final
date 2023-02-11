package ru.yandex.practicum.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.yandex.practicum.item.model.Item;
import ru.yandex.practicum.user.model.User;

import java.util.List;

public interface ItemRepositoryJpa extends JpaRepository<Item, Long> {
    /**
     * Поиск вещей пользователя.
     * @param owner пользователь, чьи вещи надо найти в БД.
     * @return список вещей.
     */
    List<Item> findAllByOwnerOrderById(User owner);


    @Query("select item from Item item "
            + "where lower(item.name) like lower(concat('%', ?1, '%')) "
            + "or lower(item.description) like lower(concat('%', ?1, '%')) ")
    List<Item> searchItemsByText(String text);
}
