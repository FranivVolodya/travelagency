package com.softserve.turfirma.web;

import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softserve.turfirma.domain.Client;
import com.softserve.turfirma.services.IClientService;






@Controller
public class ClientController {

	@Autowired
	private IClientService clientService;
	@RequestMapping("/index")
	public String listClients(Map<String, Object> map) {
	map.put("client", new Client());
	map.put("clientList", clientService.getAllClients());
	return "client";
	}
	@RequestMapping("/welcom")
	public String signIn() {
	return "welcom";
	}
	@RequestMapping("/")
	public String home() {
	return "redirect:/welcom";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addclient(@ModelAttribute("client") Client client,
	BindingResult result) {
	clientService.addClient(client);
	return "redirect:/index";
	}
	@RequestMapping("/delete/{clientId}")
	public String deleteClient(@PathVariable("clientId") Integer
	clientId) {
	clientService.deleteClient(clientId);
	return "redirect:/index";
	}
}
