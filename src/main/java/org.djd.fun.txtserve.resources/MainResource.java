package org.djd.fun.txtserve.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(MainResource.MAIN_RESOURCE_PATHH)
public class MainResource {

  public static final String MAIN_RESOURCE_PATHH = "/main";

  @GET
  @Produces( { MediaType.APPLICATION_JSON })
  public String getMsg(@QueryParam("fullName") String fullName) {
    return "Welcome to REST World, " + fullName;
  }
}