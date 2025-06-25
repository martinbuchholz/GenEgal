import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { RoomListComponent } from './components/room-list/room-list.component';
import { BookingCreateComponent } from './components/booking-create/booking-create.component';
import { BookingListComponent } from './components/booking-list/booking-list.component';

@NgModule({
  declarations: [
    AppComponent,
    RoomListComponent,
    BookingCreateComponent,
    BookingListComponent
  ],
  imports: [BrowserModule, FormsModule, HttpClientModule],
  bootstrap: [AppComponent]
})
export class AppModule {}
