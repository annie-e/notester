package ca.hackville.hamstarz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.hackville.hamstarz.beans.User;
import ca.hackville.hamstarz.repositories.UserRepository;

@Controller
public class SecurityController {
	
	@Autowired
	@Lazy
	private UserRepository userRepo;
	
	@GetMapping("/login")
	public String goLogin() {
		return "login.html";
	}
	
	@GetMapping("/access-denied")
	public String accessdenied() {
		return "access-denied.html";
	}
	
	@GetMapping("/register")
	public String getToRegistration() {
		return "register.html";
	}
	
	@PostMapping("/register")
	public String collectRegistrationData(@RequestParam String username,
										@RequestParam String password) {
		
		userRepo.addUser(username, password);
		User user = userRepo.findUserAccount(username);
		userRepo.addRole(user.getUserId(), 2); // user
		
//		userRepo.addRole(user.getUserId(), 1); // admin
//		userRepo.addRole(user.getUserId(), 3); // pickle
		
		
		return "redirect:/";
	}

}
