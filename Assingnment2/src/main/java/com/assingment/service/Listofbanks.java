package com.assingment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Listofbanks {

	public  List<String> allbanks()
	{
		List<String> Address = new ArrayList<>();	
		Address.add("Bangalore Palace.");
		Address.add("Tipu Sultan's Summer Palace.");
		Address.add("Lal Bagh Botanical Gardens.");
		Address.add("Nandi Hills.");
		Address.add("Cubbon Park.");
		Address.add("National Gallery Of Modern Art");
		Address.add("Ulsoor Lake");
		Address.add("Government Museum");
		Address.add("Nandi Hills");
		Address.add("Sakleshpur");
		return Address;	
	}
	
	public List<String> bankservices()
	{
		List<String> services = new ArrayList<>();
		services.add("Deposit Money");
		services.add("WithDraw Money");
		services.add("Open new Account");
		services.add("Update Passbook");
		services.add("Open New FD");
		return services;
	}
	
}
