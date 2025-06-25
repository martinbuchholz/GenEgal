package com.example.meetingrooms.service;

import com.example.meetingrooms.dto.RoomDto;
import com.example.meetingrooms.model.Room;
import com.example.meetingrooms.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public List<Room> findAll() {
        return repository.findAll();
    }

    public Room create(RoomDto dto) {
        Room room = new Room(dto.getName(), dto.getCapacity());
        return repository.save(room);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
