import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Booking } from '../models/booking';

@Injectable({ providedIn: 'root' })
export class BookingService {
  private base = `${environment.apiUrl}/bookings`;
  constructor(private http: HttpClient) {}

  getBookings(): Observable<Booking[]> {
    return this.http.get<Booking[]>(this.base);
  }

  create(booking: Booking): Observable<Booking> {
    return this.http.post<Booking>(this.base, booking);
  }
}
