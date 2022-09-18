import { DatePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../beans/student';
import { StudentService } from '../services/student.service';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  studentList=[new Student(0,'','','','',0,new Date())]
  constructor(private service:StudentService ,private router:Router) { }

  ngOnInit(): void {
    this.refreshStudentList();
  }

  refreshStudentList()
  {
    this.service.getAllStudentsList().subscribe(
      response=>{
        this.studentList=response;
        console.log(response);
      }
    )
  }

  deleteStudent(studentId:number)
  {
    console.log(studentId);
    this.service.deleteStudent(studentId)
    .subscribe(
      response =>{
        this.refreshStudentList();
      }
    )
  }

}
