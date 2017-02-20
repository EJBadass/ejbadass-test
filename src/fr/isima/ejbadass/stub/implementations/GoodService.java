package fr.isima.ejbadass.stub.implementations;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.annotation.Prefered;
import fr.isima.ejbadass.annotation.Singleton;
import fr.isima.ejbadass.log.Log;
import fr.isima.ejbadass.stub.interfaces.ILogService;
import fr.isima.ejbadass.stub.interfaces.IService;
import fr.isima.ejbadass.stub.interfaces.IService2;

@Singleton
@Prefered
public class GoodService implements IService, ILogService {
	@Inject
	IService2 joker;
	
	@Override
	public String giveMeAHand() {
		return "GOOD";
	}

	@Override
	public IService2 getJokerService() {
		return joker;
	}

	@Log
	public void loggedMethod() {
		
	}
}
