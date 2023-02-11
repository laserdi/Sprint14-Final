//package ru.yandex.practicum.feedback.model;
//
//import lombok.*;
//import ru.yandex.practicum.item.model.Item;
//import ru.yandex.practicum.user.model.User;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//import java.time.LocalDateTime;
//
///**
// * Отзыв о бронировании.
// */
//@Entity
//@Table(name = "feedbacks", schema = "public")
//@Getter
//@Setter
//@RequiredArgsConstructor
//@AllArgsConstructor
//public class Feedback {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false, updatable = false, unique = true)
//    Long id;
//    @Column(name = "content", nullable = false, length = 512)
//    @NotBlank(message = "Отзыв о вещи не должен быть пустым.")
//    String content;
//    @ManyToOne
//    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
//    User author;
//    @ManyToOne
//    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
//    Item item;
//    @Column(name = "created_date", nullable = false)
//    LocalDateTime createdDate;
//}
