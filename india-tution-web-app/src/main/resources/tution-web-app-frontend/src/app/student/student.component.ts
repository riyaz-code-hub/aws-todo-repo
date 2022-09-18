import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../beans/student';
import { StudentService } from '../services/student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  student= new Student(0,'','','','',0,new Date());
  constructor(private service:StudentService,private router:Router) { }

  ngOnInit() {

   //this.student=new Student(0,'','','','',0,new Date());
  }

 
  saveStudent()
  {
    this.service.saveStudentData(this.student).subscribe(
      data=>{
        console.log(data);
        this.router.navigate(['student/list']);
      }
    );

  } 

}
