package com.sai.aws.acr.registration.controller;

import com.sai.aws.acr.registration.entity.AutonomousCar;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
	
	@GetMapping("/signup")
	public String showRegistrationForm(AutonomousCar user) {
		return "add-autonomous-car";
	}
	
	@GetMapping("/car-registration")
	public String carRegistration(Model model) {
		return "car-registration";
	}
	
	@PostMapping("/add-autonomous-car")
	public String addUser(AutonomousCar autonomousCar, BindingResult result, Model model){
		
		if (result.hasErrors()) {
			return "add-autonomous-car";
		}
		
		return "redirect:/car-registration";
	}
}
