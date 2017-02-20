package fr.isima.ejbadass.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Proxy;

import org.junit.Before;
import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.plugable.BInvocationHandler;
import fr.isima.ejbadass.stub.implementations.GoodService;
import fr.isima.ejbadass.stub.implementations.JokerService;
import fr.isima.ejbadass.stub.interfaces.IService;
import fr.isima.ejbadass.stub.interfaces.IService2;

public class TestCascade {
	
	@Inject
	public IService service;
	
	@Before
	public void prepare() throws Exception {
		BInjector.makeAllInjection(this);
	}

	@Test
	public void testSecondLevelInjection() {
		assertNotNull(service);
		assertNull(((BInvocationHandler)Proxy.getInvocationHandler(service)).getInstance());
		IService2 joker = service.getJokerService();
		assertTrue(((BInvocationHandler)Proxy.getInvocationHandler(service)).getInstance() instanceof GoodService);
		assertEquals("Joker", service.getJokerService().giveMeAHand());
		assertTrue(((BInvocationHandler)Proxy.getInvocationHandler(joker)).getInstance() instanceof JokerService);
	}

}
