package fr.isima.ejbadass.stub.implementations;

import fr.isima.ejbadass.stub.interfaces.IMultiService;

public class MultiServiceB implements IMultiService {
	@Override
	public String giveMeAHand() {
		return "B";
	}
}
