import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <mat-toolbar color="primary">Meeting Rooms</mat-toolbar>
    <div class="content">
      <app-room-list></app-room-list>
      <app-booking-create></app-booking-create>
      <app-booking-list></app-booking-list>
    </div>
  `
})
export class AppComponent {}
