package com.example.meetingrooms.repository;

import com.example.meetingrooms.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {}
