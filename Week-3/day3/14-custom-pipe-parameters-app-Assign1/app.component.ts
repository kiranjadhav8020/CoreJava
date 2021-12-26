import { Component } from '@angular/core';
import {FilterData} from './filterData';

import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-root',
	template: `
	<input type="text" [(ngModel)]="str">
	
	<ul>
	<li *ngFor="let point of (points | filterData:str)">
	{{point}}
	</li>
	</ul>
	<br><br>

	<input type="text" [(ngModel)]="str1">
	<ul>
	<li *ngFor="let point of (points1 | filterData1:str1)">
	{{point}}
	</li>
	</ul>


	    `

		
})



export class AppComponent {

	str: string="";
	points: string[] = [
		 'aa',
		 'bb',
		 'cc',
		 'dd' 
	];

	str1: string="";
	points1: string[] = [
		 'ee',
		 'ff',
		 'gg',
		 'hh' 
	];
}