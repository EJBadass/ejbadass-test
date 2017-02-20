package fr.isima.ejbadass.test;

import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.exception.MultiplePreferedImplementationFoundException;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.stub.interfaces.IMultiPreferedService;

public class TestMultiPrefered {

	@Inject
	IMultiPreferedService service;

	@Test(expected= MultiplePreferedImplementationFoundException.class)
	public void testAtPreferedDoNotKnowWhichIsYourPrefered() throws Exception {
		BInjector.makeAllInjection(this);
	}

}
