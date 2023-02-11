package ru.yandex.practicum.booking.model;

import lombok.*;
import ru.yandex.practicum.item.model.Item;
import ru.yandex.practicum.user.model.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
//@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "bookings", schema = "public")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long id;                    //ID бронирования. Видно везде.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;                //ID вещи. Видно везде.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booker_id", nullable = false)
    private User booker;                //Арендатор вещи. Видно не везде.
    @Column(name = "start_time")
    @NotNull
    private LocalDateTime startTime;    //Дата начала бронирования. Видно везде.
    @Column(name = "end_time")
    @NotNull
    private LocalDateTime endTime;      //Дата окончания бронирования. Видно везде.
    @Column(name = "status")
    private BookingStatus bookingStatus;//Статус бронирования (в ожидании, подтверждён, отменён, )
}
