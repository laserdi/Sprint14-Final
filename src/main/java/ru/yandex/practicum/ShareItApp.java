package ru.yandex.practicum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//2023.01.25 From 3750317d
@SpringBootApplication
public class ShareItApp {
    public static void main(String[] args) {
        SpringApplication.run(ShareItApp.class, args);
        System.out.println("*".repeat(108) + "\n" + "*".repeat(40) + "       Сервер запущен.      "
                + "*".repeat(40) + "\n" + "*".repeat(108));

    }

}
