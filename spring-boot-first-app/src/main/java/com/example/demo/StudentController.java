package com.example.demo;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//    http://localhost:8080/student
	//    getStudent() method called
	
	
       @GetMapping("/student")
	   public  Student getStudent() {
		return new Student("Zeeshan","Khan");
       }
		
        @GetMapping("/students")
        public ArrayList<Student> getStudents(){
			ArrayList<Student> students= new ArrayList<>();
			students.add(new Student("Tony","Stark"));
	        students.add(new Student("Morgan","Stark"));
	        students.add(new Student("Thanos","Stark"));
	    
	        return students;
		}



// http://localhost:8080/student/ramesh/fadatare
//Write a rest api which will handle this kind of request
/*    uri template variable [@GetMapping("{firstName}/{lastName}")] is connected by methods
      firstName and lastName by @PathVariable */
        
        @GetMapping("/student/{firstName}/{lastName}")
        public Student studentPathVariable(@PathVariable("firstName")String firstName,@PathVariable("lastName")String lastName) {
        	return new Student(firstName, lastName);
        }
        
        
        
     // http://localhost:8080/student/query?firstName=Tony&lastName=Stark
      //Write a rest api which will handle this kind of request
      /*   firstName from GetMapping and from new Student are binded by @RequestParam */
              
        
        
        @GetMapping("/student/query")
        public Student studentQueryParam(
        		@RequestParam(name="firstName")String firstName,
        		@RequestParam(name="lastName")String lastName
        		){
        	return new Student(firstName,lastName);
        }
        
        
}