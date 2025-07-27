package com.abhas;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/config")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_JSON)
public class configResource {

    @Inject
    ConfigService configService;

    @POST
    @Path("/system")
    public String saveSystemConfig(ConfigRequest request) {
        String path = configService.getSystemConfigPath(request.serviceKey, request.moduleKey);
        configService.newConfig(path, request.content);
        return "Config saved at path: " + path;
    }

    @GET
    @Path("/fetch")
    public String fetchConfig(@QueryParam("path") String path) {
        return configService.fetchConfig(path);
    }


}
