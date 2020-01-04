package com.restclient.app;

import javax.json.JsonArray;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
	//CLIENT USING READALL
public class RestClientApp {
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		//Server to hit / aim
		WebTarget target = client.target("http://localhost:8080/Exercise45Rest/Customer"); //We selected "Customer" because we have an readAll here
		JsonArray response= target.request(MediaType.APPLICATION_JSON).get(JsonArray.class);
		System.out.println(response);
		
	}
}
