package fr.isima.ejbadass.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Proxy;

import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.plugable.BInvocationHandler;
import fr.isima.ejbadass.stub.implementations.GoodService;
import fr.isima.ejbadass.stub.interfaces.IService;

public class TestAtPrefered {

	@Inject
	IService service;
	
	@Test
	public void testAtPreferedDoNotThrowException() throws Exception {
		BInjector.makeAllInjection(this);
		assertNotNull(service);
		assertNull(((BInvocationHandler)Proxy.getInvocationHandler(service)).getInstance());
		service.giveMeAHand();
		assertTrue(((BInvocationHandler)Proxy.getInvocationHandler(service)).getInstance() instanceof GoodService);
	}

}
