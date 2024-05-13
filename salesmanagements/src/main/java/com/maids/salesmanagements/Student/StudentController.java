package com.maids.salesmanagements.Student;

import com.maids.salesmanagements.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    private final StudentService studentService;

    //dependency injection
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping
    public ResponseEntity<ApiResponse>  registerNewStudent(@Valid @RequestBody Student student) {
        studentService.addNewStudent(student);
        ApiResponse response = new ApiResponse(true, "Student added successfully", null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
//    @PostMapping
//    public void registerNewStudent(@RequestBody Student student, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            // Handle validation errors here
//            // You can return an error response or perform any other actions
//        }
//        studentService.addNewStudent(student);
//    }

    //    @DeleteMapping(path = "{studentId}")
//    public void deleteStudent(@PathVariable("studentId") Long studentId) {
//        studentService.deleteStudent(studentId);
//    }
//    @DeleteMapping(path = "{studentId}")
//    public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Long studentId) {
//        studentService.deleteStudent(studentId);
//        return ResponseEntity.status(HttpStatus.OK).body("Success");
//    }
    @DeleteMapping(path = "{studentId}")
    public ResponseEntity<ApiResponse> deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        ApiResponse response = new ApiResponse(true, "Student deleted successfully", null);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }


}
