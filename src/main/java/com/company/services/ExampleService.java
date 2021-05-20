package com.company.services;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {
	
	@EndpointInject(uri = "direct:example:start")
	private FluentProducerTemplate producer;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getExample() {
		return producer.request(String.class);
	}

}
