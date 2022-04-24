package com.swamy.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

	@GetMapping("/welcome")
	public String showWelcomePage() {
		return "WelcomePage";
	}

	@GetMapping("/home")
	public String showHomePage() {
		return "HomePage";
	}
}
