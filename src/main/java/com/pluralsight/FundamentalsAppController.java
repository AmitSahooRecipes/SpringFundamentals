package com.pluralsight;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FundamentalsAppController {
	@RequestMapping("/welcome")    
	String home() {
		return ("Welcome to Trackzilla");
	}
}
