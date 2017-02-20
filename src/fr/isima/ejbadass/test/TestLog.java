package fr.isima.ejbadass.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.injection.BInjector;
import fr.isima.ejbadass.log.ILogger;
import fr.isima.ejbadass.stub.interfaces.ILogService;

public class TestLog {
	
	@Inject
	ILogger logger;
	
	@Inject
	ILogService service;
	
	@Before
	public void prepare() throws Exception {
		BInjector.makeAllInjection(this);
	}

	@Test
	public void test() {
		service.loggedMethod();
		assertTrue(logger.contains("loggedMethod"));
	}

}
