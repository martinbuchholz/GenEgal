import { Component, OnInit } from '@angular/core';
import { BookingService } from '../../services/booking.service';
import { Booking } from '../../models/booking';

@Component({
  selector: 'app-booking-list',
  templateUrl: './booking-list.component.html'
})
export class BookingListComponent implements OnInit {
  bookings: Booking[] = [];
  constructor(private bookingService: BookingService) {}
  ngOnInit(): void {
    this.bookingService.getBookings().subscribe(b => this.bookings = b);
  }
}
