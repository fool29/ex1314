package japan.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  
  @GetMapping("/")
  public String getAll(){
    return "Welcome to Spring Boot Application";
  }

  @GetMapping("/{id}")
  public String getStudent(@PathVariable int id){
    return "Student with id: " + id;
  }

  @PostMapping
  public String createStudent(){
    return "Student created successfully";
  }

  
}
