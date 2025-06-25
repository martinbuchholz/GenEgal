package com.example.meetingrooms.service;

import com.example.meetingrooms.dto.BookingDto;
import com.example.meetingrooms.model.Booking;
import com.example.meetingrooms.model.Room;
import com.example.meetingrooms.repository.BookingRepository;
import com.example.meetingrooms.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final RoomRepository roomRepository;

    public BookingService(BookingRepository bookingRepository, RoomRepository roomRepository) {
        this.bookingRepository = bookingRepository;
        this.roomRepository = roomRepository;
    }

    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    public Booking create(BookingDto dto) {
        Room room = roomRepository.findById(dto.getRoomId()).orElseThrow();
        if (!bookingRepository.findOverlapping(room.getId(), dto.getStartTime(), dto.getEndTime()).isEmpty()) {
            throw new IllegalStateException("Booking overlaps with existing booking");
        }
        Booking booking = new Booking(room, dto.getStartTime(), dto.getEndTime(), dto.getUserName());
        return bookingRepository.save(booking);
    }

    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }
}
