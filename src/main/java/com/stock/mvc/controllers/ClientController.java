package com.stock.mvc.controllers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.stock.mvc.bean.Client;
import com.stock.mvc.service.ClientService;


@Controller
@RequestMapping(value="/client")
public class ClientController {
	/*@Autowired
	private FlikrService flikrService;*/
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/")
	public String client(Model model) {
		List<Client> clients =clientService.selectAll();	
		if(clients==null) {
			clients =new ArrayList<Client>();
		}
		model.addAttribute("clients",clients);
		return "client/client";
	}
	@RequestMapping(value="/nouveau", method= RequestMethod.GET)
	public String ajouterClient(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "client/ajouterClient";
	}
	/*
	@RequestMapping(value="/nouveau", method= RequestMethod.POST)
	public String enregistrerClient(Model model, Client client , MultipartFile file){ 
		
		String photoUrl =null;
		if(client!=null) {
			if(file!=null && !file.isEmpty()) {	
			try{
			
			InputStream stream = file.getInputStream();
					photoUrl=flikrService.savePhoto(stream, client.getNom());
			  }	catch(Exception e){
			               e.printStackTrace();
			        }	finally {
			        	try {
							  stream.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
			      
			        }
						
			}
			client.setPhoto(photoUrl);
			if(client.getId()!=null){
			              clientService.update(client);
			         }
			else{
			
			clientService.save(client);
			}
		}
		return "redirect:/client";
	}*/
	@RequestMapping(value="/modifier/{id}")
	public String modifierClient(Model model, @PathVariable Long id) {
		if(id!=null) {
			Client client = clientService.getbyId(id);
			if(client!=null) {
				model.addAttribute("Client", client);
			}
		}
		
		return "client/ajouterClient";
	}
}
