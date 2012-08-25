package org.djd.fun.txtserve.resources.provider;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;

@Provider
public class JsonProvider implements ContextResolver<JAXBContext> {

  @Override
  public JAXBContext getContext(Class<?> type) {
    return null;
  }
}