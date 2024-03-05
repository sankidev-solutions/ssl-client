package com.sankidev.tls.Client.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientService {

	@Autowired
	private RestTemplate restTemplate;
	Logger log = LoggerFactory.getLogger(ClientService.class);
	
	public String callServer() {
		log.info("app: client, event : calling remote server");
//		String fooResourceUrl
//		  = "https://localhost:8081/server/hello";
//		
		String fooResourceUrl=
		"https://ec2-18-181-199-33.ap-northeast-1.compute.amazonaws.com:8081/server/hello";
		//RestTemplate restTemplate = new RestTemplate();
		String response
		  = restTemplate.getForObject(fooResourceUrl , String.class);
		
		return response;
	}
}
