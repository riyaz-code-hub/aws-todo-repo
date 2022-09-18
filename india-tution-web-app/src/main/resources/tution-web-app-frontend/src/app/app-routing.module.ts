import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentListComponent } from './student-list/student-list.component';
import { StudentComponent } from './student/student.component';

const routes: Routes = [{path:'student/list',component:StudentListComponent},
{path:'student/registration',component:StudentComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
