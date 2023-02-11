package ru.yandex.practicum.user.mapper;

import org.mapstruct.Mapper;
import ru.yandex.practicum.user.dto.UserOnlyWithIdDto;
import ru.yandex.practicum.user.model.User;

@Mapper(componentModel = "spring")
public interface UserToUserOnlyWithIdDtoMapper {
    /**
     * Из объекта поля в Bookinge в юзера.
     */
//    @Mapping(target = "id", source = "id")
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "email", source = "email")
    User mapToModel(UserOnlyWithIdDto userDto);

    /**
     * Из юзера в объект для ответа в Booking.
     */
//    @Mapping(target = "id", source = "id")
//    @Mapping(target = "name", source = "name")
//    @Mapping(target = "email", source = "email")
    UserOnlyWithIdDto mapToDto(User user);
}
