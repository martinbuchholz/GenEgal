package com.example.meetingrooms.controller;

import com.example.meetingrooms.dto.RoomDto;
import com.example.meetingrooms.model.Room;
import com.example.meetingrooms.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
@CrossOrigin
public class RoomController {
    private final RoomService service;
    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping
    public List<Room> all() {
        return service.findAll();
    }

    @PostMapping
    public Room create(@RequestBody RoomDto dto) {
        return service.create(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
