package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Basiccontoller {
	@GetMapping ("/first")
	public String print() {
		return"welcome to java world";
	}

}
