package fr.isima.ejbadass.stub.implementations;

import fr.isima.ejbadass.annotation.Prefered;
import fr.isima.ejbadass.stub.interfaces.IService2;

@Prefered
public class JokerService implements IService2 {
	@Override
	public String giveMeAHand() {
		return "Joker";
	}

	@Override
	public IService2 getJokerService() {
		return null;
	}
}
