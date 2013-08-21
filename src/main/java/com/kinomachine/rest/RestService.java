package com.kinomachine.rest;

import javax.inject.Singleton;
import javax.ws.rs.*;

@Singleton
@Path("/rest")
public class RestService {

    @GET
    @Path("/status")
    public String status(){
        return "OK";
    }
}
