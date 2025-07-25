package com.abhas;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.HashMap;
import java.util.Map;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String,String> hello() {

        Map<String,String> response = new HashMap<>();
        response.put("message", "Hello World");

        return response;
    }
}
