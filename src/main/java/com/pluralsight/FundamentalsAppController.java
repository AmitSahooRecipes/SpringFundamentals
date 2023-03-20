package com.pluralsight;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FundamentalsAppController {
	@RequestMapping("/hello")    
	String home() {
		return ("Hello Pluralsight!!!!");
	}
}
