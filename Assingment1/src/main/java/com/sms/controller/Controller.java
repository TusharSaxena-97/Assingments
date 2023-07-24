package com.sms.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping("name")
	public String nameofbank()
	{
		return "State Bank Of India";
	}
	
	@GetMapping("address")
	public String addofbank()
	{
		return "B-605 Civil Lines, Bareilly (243001)";
	}
}
