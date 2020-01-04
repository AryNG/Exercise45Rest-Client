package com.restclient.app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.restclient.model.Product;

public class RestClient2 {
	//CLIENT USING POST
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/Exercise45Rest/").path("Product");
		
		Invocation.Builder sendJson = target.request(MediaType.APPLICATION_JSON);
		
		Product myProduct = new Product();
		myProduct.setIdProduct(1);
		myProduct.setNombreProduct("Arizona");
		myProduct.setPrecioProduct(12.50);
		
		Response response = sendJson.post(Entity.entity(myProduct, MediaType.APPLICATION_JSON));
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));

	}

}
