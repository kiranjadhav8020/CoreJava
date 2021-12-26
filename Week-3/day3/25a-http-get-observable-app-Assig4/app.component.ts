import { Component, OnInit } from '@angular/core';
import { PostService } from './post.service';
import { Post } from './post';
import { Ticket } from './Ticket';
import { Router } from '@angular/router';

  
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  name = 'Angular';
  
  posts = new Array<Post>();
  Ticket = new Array<Ticket>();
    
  constructor(private service:PostService) {}
    
  ngOnInit() {
      this.service.getTicket().subscribe(response => {
          this.Ticket = response.map(item => 
            {
              return new Ticket( 
                  item.ticketid,
                  item.travelsname,
                  item.fromplace,
                  item.toplace
              );
            });
        });
  
  //this.service.createUser();
      }

      onClickSubmit(userdetails: any) {
        alert("User details " + userdetails.name);
        this.service.createUser(userdetails);
     }
}