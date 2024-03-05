package com.sankidev.tls.Client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sankidev.tls.Client.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/hello-client")
	public String client() {
		return "hello from client";
	}
	
	@GetMapping("/hello-server")
	public String server() {
		return clientService.callServer();
	}
	
}
