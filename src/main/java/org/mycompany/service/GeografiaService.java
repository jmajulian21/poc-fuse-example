package org.mycompany.service;

import org.apache.camel.EndpointInject;
import org.apache.camel.FluentProducerTemplate;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeografiaService {
	private String uriGeorefProvincia = "restlet:http://apis.datos.gob.ar:80/georef/api/provincias";
	private String uriGeorefLocalidad = "restlet:http://apis.datos.gob.ar:80/georef/api/localidades";
	
	@EndpointInject(uri = "direct:api-get-provincias:start")
	private FluentProducerTemplate producer;
	
	@Produce(uri = "direct:api-post-provincia:start")
    private ProducerTemplate template;

	@RequestMapping(value="/provincia", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getProvincia(@RequestParam String nombre) {
		String uriProvincia = uriGeorefProvincia;
		
		if(nombre != null && !nombre.isEmpty())
			uriProvincia += "?nombre=" + nombre;
		
		
		producer.withHeader("uriProvincia", uriProvincia);
		producer.withHeader("uriLocalidad", uriGeorefLocalidad);
		
		return producer.request(String.class);
	}
	
	@RequestMapping(value="/provincia", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void postProvincia(@RequestBody String request) {
		template.sendBody(request);
	}
}