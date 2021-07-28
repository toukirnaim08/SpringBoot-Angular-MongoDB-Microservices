import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CourseComponent } from './component/course/course.component';
import { HomeComponent } from './component/home/home.component';
import { ManagementComponent } from './component/management/management.component';
import { StudentComponent } from './component/student/student.component';
import { TeacherComponent } from './component/teacher/teacher.component';

const routes: Routes = [
  {
    path:"",
    component:HomeComponent
  },
  {
    path:"student",
    component: StudentComponent
  },
  {
    path:"course",
    component:CourseComponent
  },
  {
    path:"teacher",
    component:TeacherComponent
  },
  {
    path:"management",
    component:ManagementComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
