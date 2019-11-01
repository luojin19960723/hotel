package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "login.html";
	}

	@GetMapping("/info")
	public String info() {
		return "info.html";

	}

	@GetMapping("/index")
	public String index() {
		return "index.html";

	}

	@GetMapping("/we")
	public String we() {
		return "we.html";

	}
}
