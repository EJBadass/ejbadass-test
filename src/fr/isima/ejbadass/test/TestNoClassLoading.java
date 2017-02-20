package fr.isima.ejbadass.test;

import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.exception.NoImplementationFoundException;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.stub.interfaces.INoService;

public class TestNoClassLoading {
	
	@Inject
	INoService service;
	
	@Test(expected=NoImplementationFoundException.class)
	public void testClassLoader() throws Exception {
		BInjector.makeAllInjection(this);
	}

}