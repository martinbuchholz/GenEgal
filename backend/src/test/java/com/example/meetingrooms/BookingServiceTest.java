package com.example.meetingrooms;

import com.example.meetingrooms.dto.BookingDto;
import com.example.meetingrooms.model.Room;
import com.example.meetingrooms.service.BookingService;
import com.example.meetingrooms.service.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.time.LocalDateTime;

@DataJpaTest
@Import({BookingService.class, RoomService.class})
public class BookingServiceTest {
    @Autowired
    private BookingService bookingService;
    @Autowired
    private RoomService roomService;

    private Long roomId;

    @BeforeEach
    void setup() {
        roomId = roomService.create(new com.example.meetingrooms.dto.RoomDto(null, "Test", 1)).getId();
    }

    @Test
    void testOverlap() {
        bookingService.create(new BookingDto(null, roomId, LocalDateTime.now(), LocalDateTime.now().plusHours(1), "Bob"));
        Assertions.assertThrows(IllegalStateException.class, () ->
                bookingService.create(new BookingDto(null, roomId, LocalDateTime.now().plusMinutes(30), LocalDateTime.now().plusHours(2), "Alice")));
    }
}
