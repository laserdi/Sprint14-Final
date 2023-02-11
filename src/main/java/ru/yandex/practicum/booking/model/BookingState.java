package ru.yandex.practicum.booking.model;

/**
 * Используется для корректировки логики работы программы.
 */
public enum BookingState {
    ALL,
    CURRENT,
    PAST,
    FUTURE,
    WAITING,
    REJECTED,
    UNKNOWN;
}
