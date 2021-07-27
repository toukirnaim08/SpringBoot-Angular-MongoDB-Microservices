import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  tempTitle = "tempTitle";
  isOpened = false;

  constructor() { 

  }

  ngOnInit(): void {
  }
  toggleSidebar(){
    this.isOpened = !this.isOpened;
    console.log(this.isOpened);
  }

  checkLog(){
    console.log("tempClicking");
  }

}
