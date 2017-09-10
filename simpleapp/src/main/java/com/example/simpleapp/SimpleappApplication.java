package com.example.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SimpleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleappApplication.class, args);
	}
	
	@Controller
	public static class HomeController {
		
		@GetMapping("/say-hi")
		@ResponseBody
		public String home(){
			return "hello world!";
		}	
	}
}
