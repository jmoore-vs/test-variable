package com.example.demovariableentorno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VariableController {

	private static final Logger logger = LoggerFactory.getLogger(VariableController.class);
	
	@Value("${mq.queue}")
    private String nombreCola;
	
	@GetMapping("/")
	public String defecto() {
		logger.info("variable inyectada desde openshift: "+nombreCola);
		return "variable inyectada: "+nombreCola;
	}
	
}
