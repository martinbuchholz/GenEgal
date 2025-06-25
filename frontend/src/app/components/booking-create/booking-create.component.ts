import { Component, OnInit } from '@angular/core';
import { BookingService } from '../../services/booking.service';
import { RoomService } from '../../services/room.service';
import { Booking } from '../../models/booking';
import { Room } from '../../models/room';

@Component({
  selector: 'app-booking-create',
  templateUrl: './booking-create.component.html'
})
export class BookingCreateComponent implements OnInit {
  booking: Partial<Booking> = {};
  rooms: Room[] = [];
  constructor(private bookingService: BookingService, private roomService: RoomService) {}

  ngOnInit(): void {
    this.roomService.getRooms().subscribe(r => this.rooms = r);
  }

  submit() {
    if (this.booking.roomId && this.booking.startTime && this.booking.endTime) {
      this.bookingService.create(this.booking as Booking).subscribe();
    }
  }
}
