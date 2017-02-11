package com.swap.initial.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class InitialService {

	public String getServiceResponse() {
		return "service response";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("post construct called");
	}
}
