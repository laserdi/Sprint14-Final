package ru.yandex.practicum.item.dto;

import lombok.*;
import ru.yandex.practicum.booking.dto.BookingForItemDto;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ItemWithBookingDto {
    private Long id;
    private String name;
    private String description;
    private Boolean available;

    private BookingForItemDto lastBooking;
    private BookingForItemDto nextBooking;
    private Long requestId;

}
