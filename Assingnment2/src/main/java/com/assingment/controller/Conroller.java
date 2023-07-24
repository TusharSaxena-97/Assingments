package com.assingment.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import com.assingment.service.Listofbanks;

@Controller
public class Conroller {
	
	@Autowired
	Listofbanks listofbanks;
	
	@GetMapping("/BankInfo")	
	public String BankInformation(Model model)
	{
		String bankname = "State Bank Of India";
		model.addAttribute("name",bankname);
		model.addAttribute("address",listofbanks.allbanks());
		return "bankinfo";
	}
	
	@GetMapping("/BankService")	
	public String BankService(Model model)
	{
		String bankname = "Punjab National Bank";
		model.addAttribute("service",listofbanks.bankservices());
		model.addAttribute("name",bankname);
		return "BankService";
	}
}
