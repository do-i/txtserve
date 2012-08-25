package org.djd.fun.txtserve.resources;

import com.sun.jersey.spi.container.servlet.ServletContainer;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;
import com.sun.jersey.test.framework.spi.container.grizzly2.web.GrizzlyWebTestContainerFactory;

public class AbstractTxtserveJerseyTest extends JerseyTest{

    public static final String ROOT_PACKAGE_NAME = "org.djd.fun.txtserve.resources";

    /**
     * {@link JerseyTest}
     */
    public AbstractTxtserveJerseyTest() {
      super(new WebAppDescriptor.Builder(ROOT_PACKAGE_NAME)
          .servletClass(ServletContainer.class)
          .build());
    }

    @Override
    protected TestContainerFactory getTestContainerFactory() {
      return new GrizzlyWebTestContainerFactory();
    }
  }

