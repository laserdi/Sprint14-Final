package ru.yandex.practicum.booking.mapper;

import org.mapstruct.Mapper;
import ru.yandex.practicum.booking.dto.BookingDto;
import ru.yandex.practicum.booking.model.Booking;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    /**
     * Из объекта для ответа в контроллере в бронь.
     */
    Booking mapToModel(BookingDto bookingDto);

    /**
     * Из брони в объект для ответа в контроллере.
     */
    BookingDto mapToDto(Booking booking);
}
