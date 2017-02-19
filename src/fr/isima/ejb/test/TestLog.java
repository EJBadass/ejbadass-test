package fr.isima.ejb.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.isima.ejb.annotation.Inject;
import fr.isima.ejb.injection.BInjector;
import fr.isima.ejb.log.ILogger;
import fr.isima.ejb.stub.interfaces.ILogService;

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
