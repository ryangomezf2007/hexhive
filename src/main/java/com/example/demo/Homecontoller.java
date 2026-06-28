package com.example.demo;

package com.pillpal.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Homecontroller {


	@GetMapping("/")
	public String home(){

		return "index";
	}
}
