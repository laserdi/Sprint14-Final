package ru.yandex.practicum.item.comment.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.yandex.practicum.item.comment.dto.CommentDto;
import ru.yandex.practicum.item.comment.model.Comment;

@Mapper(componentModel = "spring")
public interface CommentDtoMapper {
    /**
     * Из объекта для ответа в модель.
     */
    @Mapping(target = "author.name", source = "authorName")
    Comment mapToModel(CommentDto commentDto);

    /**
     * Из модели в объект для ответа.
     */
    @Mapping(target = "authorName", source = "author.name")
    CommentDto mapToDto(Comment comment);
}
