package com.example.meetingrooms.repository;

import com.example.meetingrooms.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    @Query("select b from Booking b where b.room.id = :roomId and b.startTime < :endTime and b.endTime > :startTime")
    List<Booking> findOverlapping(@Param("roomId") Long roomId,
                                  @Param("startTime") LocalDateTime startTime,
                                  @Param("endTime") LocalDateTime endTime);
}
