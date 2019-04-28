package com.stock.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mvc.service.ClientService;

@Controller
@RequestMapping(value="/client")
public class ClientController {
	
	private ClientService clientService;
	
	@RequestMapping(value="/")
	public String client(Model model) {
		
		return "client/client";
	}
}
