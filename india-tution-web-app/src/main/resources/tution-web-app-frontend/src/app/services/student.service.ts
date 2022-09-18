import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from '../beans/student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http:HttpClient) { }

 getAllStudentsList()
 {
  return this.http.get<Student[]>('http://localhost:9191/student/all');
 }

 deleteStudent(studentId:number)
 {
  return this.http.delete('http://localhost:9191/student/delete/id/${studentId}');
 }

 saveStudentData(student:Student)
 {
  return this.http.post('http://localhost:9191/student/add',student);
 }

}
