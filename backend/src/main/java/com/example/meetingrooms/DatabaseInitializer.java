package com.example.meetingrooms;

import com.example.meetingrooms.model.Booking;
import com.example.meetingrooms.model.Room;
import com.example.meetingrooms.repository.BookingRepository;
import com.example.meetingrooms.repository.RoomRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class DatabaseInitializer {
    @Bean
    CommandLineRunner init(RoomRepository roomRepository, BookingRepository bookingRepository) {
        return args -> {
            Room room1 = roomRepository.save(new Room("Alpha", 10));
            Room room2 = roomRepository.save(new Room("Beta", 5));
            bookingRepository.save(new Booking(room1, LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2), "Alice"));
        };
    }
}
