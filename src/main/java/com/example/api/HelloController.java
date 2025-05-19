package com.example.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String Greet() {
		return "Welcome to OAuth2";
	}
	
	@GetMapping("/user")
	public String user(@AuthenticationPrincipal OAuth2User principal) {
	    return principal.getAttributes().toString();
	}

	
}
