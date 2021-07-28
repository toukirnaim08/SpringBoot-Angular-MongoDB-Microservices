import { Component, OnInit } from '@angular/core';
import { DbService } from 'src/app/service/db.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  constructor(private dbService:DbService) { 

  }

  ngOnInit(): void {

  }
  dbResponse(){
    //console.log("checked");
    this.dbService.getAllStudentsData();
  }
  

}
