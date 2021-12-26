import { NgModule } from '@angular/core';
import { BrowserModule }  from '@angular/platform-browser';
import { Options } from './options';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  imports: [
    BrowserModule,FormsModule
  ],
  declarations: [
    AppComponent
  ],
  providers: [
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }

