import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {SidebarModule} from 'ng-sidebar';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './component/home/home.component';
import { StudentComponent } from './component/student/student.component';
import { CourseComponent } from './component/course/course.component';
import { TeacherComponent } from './component/teacher/teacher.component';
import { ManagementComponent } from './component/management/management.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentComponent,
    CourseComponent,
    TeacherComponent,
    ManagementComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SidebarModule.forRoot(),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
