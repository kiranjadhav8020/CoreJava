import { Options } from './options';

import {Component, NgModule} from '@angular/core'
;
import {BrowserModule} from '@angular/platform-browser';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html'
})


export class AppComponent {
  
selectedOption:Options = new Options(2, 'T-Shirts',1000,true);
 result = [] as  any; 
selectedItemsList = [] as  any;
  checkedIDs = Array();
  sum :number =0;
  sum2 :number =0;
  sum3 :number =0;

options = [
     new Options(1, 'Jeans' ,4000,true),
     new Options(2, 'T-Shirts',1000,true),
     new Options(3, 'Shorts',1000,false),
     new Options(4, 'Shirts',1500,false),
    new Options(5, 'Trousers',3000,true),
     new Options(6, 'Chinos',2000,false),
     new Options(7, 'Shoes',5000,false)
  ];
  
  

getValue(optionid: number) 
{
      
this.selectedOption = this.options.filter((item: { id: any; })=> item.id == optionid)[0];
  
}

ngOnInit(): void {
  this.fetchSelectedItems()
  this.fetchCheckedIDs()
}

changeSelection(price : number) {
  this.sum=this.sum+price;
  this.fetchSelectedItems()
   
}

fetchSelectedItems() {
  this.selectedItemsList = this.options.filter((value: { isChecked: any; }, index: any) => {
   
    return value.isChecked
  });
}

fetchCheckedIDs() {
  this.checkedIDs = []
  this.options.forEach((value: { isChecked: any; id: any; }, index: any) => {
    if (value.isChecked) {
      
      this.checkedIDs.push(value.id);
    }
  });
}


}