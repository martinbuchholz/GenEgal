import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `<h1>Meeting Rooms</h1>
  <app-room-list></app-room-list>
  <app-booking-create></app-booking-create>
  <app-booking-list></app-booking-list>`
})
export class AppComponent {}
