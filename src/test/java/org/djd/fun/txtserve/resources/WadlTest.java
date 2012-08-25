package org.djd.fun.txtserve.resources;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class WadlTest extends AbstractTxtserveJerseyTest {

  @Test
  public void getWadl_noargs_success() {
    String wadl = resource().path("application.wadl").get(String.class);
    assertNotNull(wadl);
    assertTrue(wadl.contains("getMsg"));
  }
}