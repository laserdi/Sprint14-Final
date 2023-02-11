package ru.yandex.practicum.item.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yandex.practicum.item.comment.model.Comment;
import ru.yandex.practicum.item.model.Item;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    /**
     * Поиск комментариев к вещи.
     * @param itemId ID вещи.
     * @return список комментариев.
     */
    List<Comment> findAllByItem_Id(Long itemId);

    List<Comment> findAllByItemOrderById(Item item);
}
