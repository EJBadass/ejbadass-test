package fr.isima.ejbadass.test;

import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.exception.MultipleImplementationFoundException;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.stub.interfaces.IMultiService;

public class TestMultiClassLoading {
	
	@Inject
	IMultiService service;
	
	@Test(expected=MultipleImplementationFoundException.class)
	public void testClassLoader() throws Exception {
		BInjector.makeAllInjection(this);
	}

}
