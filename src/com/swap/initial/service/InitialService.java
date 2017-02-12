package com.swap.initial.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.swap.common.cache.CommonCache;

@Service
public class InitialService {

    private static Logger logger = Logger.getLogger(InitialService.class);

	@Inject
	CommonCache cache;
	
	public String getServiceResponse() {
		cache.getCache().put("1", "first");
		cache.getCache().put("2", "second");
		cache.getCache().put("3", "third");
		cache.getCache().put("4", "fourth");
		cache.getCache().put("5", "fifth");
		cache.getCache().put("6", "sixth");
		cache.getCache().put("7", "seventh");
		logger.debug("Returning service response");
		return "service response";
	}
	
	@PostConstruct
	public void init() {
		logger.debug("post construct called");
	}
}
