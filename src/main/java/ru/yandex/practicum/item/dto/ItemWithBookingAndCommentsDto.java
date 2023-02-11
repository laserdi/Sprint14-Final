package ru.yandex.practicum.item.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.yandex.practicum.booking.dto.BookingForItemDto;
import ru.yandex.practicum.item.comment.dto.CommentDto;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class ItemWithBookingAndCommentsDto {
    private Long id;
    private String name;
    private String description;
    private Boolean available;

    private BookingForItemDto lastBooking;
    private BookingForItemDto nextBooking;
    private Long requestId;
    @JsonProperty("comments")
    private List<CommentDto> feedbacks;

}
