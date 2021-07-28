import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DbService {

  rootPath = "http://192.168.8.116:9095/api/v1/";
  dbPath = "db";
  studentPath = "student";
  coursePath = "course";
  teacherPath = "teacher";
  managementPath = "management";

  constructor(private http:HttpClient) { }

  getAllStudentsData(){
    const headers = new HttpHeaders().set('Content-Type', 'text/plain; charset=utf-8');
    let response = this.http.get(this.rootPath+this.studentPath+"/all",{headers,responseType:'text'});
    response.subscribe((data)=>console.log(data));
    console.log("checked");
  }
}
