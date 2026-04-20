package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	@GetMapping("/")
	public String Home(){
		return "Hello satyakiran";

	}
	@PostMapping("/about")
	public String about(){
		return "hello";
	}

	@PutMapping("/update")
	public String data(){
		return "hello data";
	}
	@DeleteMapping("/delete")
	public String delete(){
		return "hello data delete";
	}
}
