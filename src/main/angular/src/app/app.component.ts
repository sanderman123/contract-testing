import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app works!';
  todo = {};

  constructor(private http: Http) {
  }

  ngOnInit(): void {
    this.getTodo().subscribe(t => {
      const body = t.json();
      this.todo = body;
    });
  }

  getTodo() {
    return this.http.get('/api/todo');
  }

}
