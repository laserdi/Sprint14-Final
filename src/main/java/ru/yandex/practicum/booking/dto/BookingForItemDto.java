package ru.yandex.practicum.booking.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ru.yandex.practicum.booking.model.BookingStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class BookingForItemDto {
    private Long id;
    @JsonAlias({"start"})
    private LocalDateTime startTime;
    @JsonAlias({"end"})
    private LocalDateTime endTime;
    private Long bookerId;
    private BookingStatus status;

}
