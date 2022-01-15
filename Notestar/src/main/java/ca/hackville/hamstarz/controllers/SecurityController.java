package ca.hackville.hamstarz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ca.hackville.hamstarz.repositories.UserRepository;

@Controller
public class SecurityController {
	

	@GetMapping("/login")
	public String goLogin() {
		return "login.html";
	}
	
	@GetMapping("/access-denied")
	public String accessdenied() {
		return "access-denied.html";
	}

}
