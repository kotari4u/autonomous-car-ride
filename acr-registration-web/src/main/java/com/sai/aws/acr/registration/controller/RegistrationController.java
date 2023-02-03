package com.sai.aws.acr.registration.controller;

import com.sai.aws.acr.registration.dataaccess.entity.AutonomousCar;
import com.sai.aws.acr.registration.dataaccess.repository.AutonomousCarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RegistrationController {
	
	@Autowired
	private AutonomousCarRepo autonomousCarRepo;
	
	@GetMapping("/signup")
	public String showRegistrationForm(AutonomousCar user) {
		return "add-autonomous-car";
	}
	
	@GetMapping("/car-registration")
	public Model carRegistration(Model model) {
		
		AutonomousCar autonomousCar = (AutonomousCar) model.getAttribute("addedCar");
		model.addAttribute("autonomousCars", autonomousCarRepo.findAll());
		return model;
	}
	
	@PostMapping("/add-autonomous-car")
	public String addUser(AutonomousCar autonomousCar,
								BindingResult result,
								Model model){
		
		if (result.hasErrors()) {
			return "redirect:/add-autonomous-car";
		}
		autonomousCarRepo.save(autonomousCar);
		//model.addAttribute("model", autonomousCar);
		return "redirect:/car-registration";
	}
}
