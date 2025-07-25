package com.abhas;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


@Path("/product")
public class ProductResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProduct() {

        List<Product> al = new ArrayList<>();

        Product p1 = new Product(24,"abhas",234);

        al.add(p1);

        Product p2 = new Product(25,"ayush",234);

        al.add(p2);

       return  al;
    }
}
