package com.example.managementservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/management")
public class ManagementController {
	private String dbRoot = "http://DB-SERVICES/api/v1/db/";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/save")
	public String saveNotice(){
		String Notice = restTemplate.getForObject(dbRoot+"savenotice", String.class);
		return Notice;
	}

	@GetMapping("/all")
	public String allNotices(){
		String allNotices = restTemplate.getForObject(dbRoot+"allnotices", String.class);
		return allNotices;
	}
}
