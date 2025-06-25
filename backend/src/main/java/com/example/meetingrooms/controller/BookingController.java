package com.example.meetingrooms.controller;

import com.example.meetingrooms.dto.BookingDto;
import com.example.meetingrooms.model.Booking;
import com.example.meetingrooms.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin
public class BookingController {
    private final BookingService service;
    public BookingController(BookingService service) {
        this.service = service;
    }

    @GetMapping
    public List<Booking> all() {
        return service.findAll();
    }

    @PostMapping
    public Booking create(@RequestBody BookingDto dto) {
        return service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
