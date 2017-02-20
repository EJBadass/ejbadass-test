package fr.isima.ejbadass.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Proxy;

import org.junit.Before;
import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.plugable.BInvocationHandler;
import fr.isima.ejbadass.stub.implementations.GoodService;
import fr.isima.ejbadass.stub.interfaces.IService;

public class TestInjection {
	
	@Inject
	public IService service;
	
	@Before
	public void prepare() throws Exception {
		BInjector.makeAllInjection(this);
	}

	@Test
	public void testFirstLevelInjection() {
		assertNotNull(service);
		assertTrue(Proxy.isProxyClass(service.getClass()));
		assertTrue(service instanceof Proxy);
		assertTrue(((BInvocationHandler)Proxy.getInvocationHandler(service)).getInstance()==null);
		assertEquals("GOOD", service.giveMeAHand());
		assertTrue(((BInvocationHandler)Proxy.getInvocationHandler(service)).getInstance() instanceof GoodService);
	}

}
