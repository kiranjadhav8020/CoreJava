import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Post } from './post';
import { Ticket } from './Ticket';
  
@Injectable({
  providedIn: 'root'
})
export class PostService {
    
  private url: string = 'https://jsonplaceholder.typicode.com/posts';
  constructor(private httpClient: HttpClient) { }
  
  public getPosts(): Observable<Post[]>{
    return this.httpClient.get<Post[]>(this.url);
  }

  private url1: string = 'http://localhost:8585/getAll';
  
  
  public getTicket(): Observable<Ticket[]>{
    return this.httpClient.get<Ticket[]>(this.url1);
  }

  public createUser(userdetails: any){
    //this.httpClient.post<any>('http://localhost:6164/user/create', { country: 'someecountyyyyy', name: 'abcdddd' }).subscribe({
      this.httpClient.post<any>('http://localhost:6164/user/create', userdetails).subscribe({  
    next: data => {
          console.log(JSON.stringify(data));
      },
      error: error => {
          console.error('There was an error!', error);
      }
  })
  }
  
}