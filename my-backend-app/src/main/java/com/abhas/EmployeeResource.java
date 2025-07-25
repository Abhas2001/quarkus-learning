package com.abhas;



import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@Path("/")
public class EmployeeResource{

    @GET
    @Path("/employee")
    @Produces(MediaType.APPLICATION_JSON)

    public List<Employee>  getEmployee(){

        List<Employee> l1 = new ArrayList<>();

        Employee e1 = new Employee(10,"abhas","admin",2340,false);
        Employee e2 = new Employee(14,"ayush","sadmin",2340,false);
        l1.add(e1);
        l1.add(e2);

        return l1;
    }

    @GET
    @Path("/status")
    @Produces(MediaType.APPLICATION_JSON)

    public Map<String,String> getStatus(){

        Map<String,String> m1 = new HashMap<>();

        m1.put("newstatus","sucess");

                return m1;

    }

}