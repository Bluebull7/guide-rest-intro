package main.java.io.openliberty.guides.rest;

import java.util.Properties;

import javax.annotation.processing.Generated;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("properties")
public class PropertiesResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Properties getProperties() {
        return System.getProperties();
    }
}