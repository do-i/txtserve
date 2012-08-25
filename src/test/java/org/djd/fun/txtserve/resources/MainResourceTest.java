package org.djd.fun.txtserve.resources;

import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MainResourceTest extends AbstractTxtserveJerseyTest {

  @Test
  public void get_queryParam_200() {
    String response = resource()
        .path(MainResource.MAIN_RESOURCE_PATHH)
        .queryParam("fullName", "Porky Ninja")
        .accept(MediaType.APPLICATION_JSON_TYPE)
        .get(String.class);
    assertNotNull(response);
    assertEquals("Welcome to REST World, Porky Ninja", response);
  }

}