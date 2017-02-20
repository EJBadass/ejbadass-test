package fr.isima.ejbadass.stub.implementations;

import fr.isima.ejbadass.stub.interfaces.IService;
import fr.isima.ejbadass.stub.interfaces.IService2;

public class BadService implements IService {
	@Override
	public String giveMeAHand() {
		return "BAD";
	}

	@Override
	public IService2 getJokerService() {
		return null;
	}
}
