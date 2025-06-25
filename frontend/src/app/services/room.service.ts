import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Room } from '../models/room';

@Injectable({ providedIn: 'root' })
export class RoomService {
  private base = `${environment.apiUrl}/rooms`;
  constructor(private http: HttpClient) {}

  getRooms(): Observable<Room[]> {
    return this.http.get<Room[]>(this.base);
  }
}
