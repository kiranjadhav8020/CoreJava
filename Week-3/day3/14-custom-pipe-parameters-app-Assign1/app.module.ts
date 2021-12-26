import {BrowserModule} from '@angular/platform-browser';
import {NgModule}      from '@angular/core';
import {AppComponent}  from './app.component';
import {FilterData} from './filterData';
import {FilterData1} from './filterData1';
import {FormsModule} from "@angular/forms";


@NgModule({
  imports: [     
        BrowserModule,FormsModule
  ],
  declarations: [
        AppComponent, FilterData  , FilterData1
  ],
  bootstrap: [
        AppComponent
  ]
})
export class AppModule { }
