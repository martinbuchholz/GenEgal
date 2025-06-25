package com.example.meetingrooms.dto;

import java.time.LocalDateTime;

public class BookingDto {
    private Long id;
    private Long roomId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String userName;

    public BookingDto() {}

    public BookingDto(Long id, Long roomId, LocalDateTime startTime, LocalDateTime endTime, String userName) {
        this.id = id;
        this.roomId = roomId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.userName = userName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getRoomId() { return roomId; }
    public void setRoomId(Long roomId) { this.roomId = roomId; }
    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }
    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }
}
