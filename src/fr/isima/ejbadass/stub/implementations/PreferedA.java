package fr.isima.ejbadass.stub.implementations;

import fr.isima.ejbadass.annotation.Prefered;
import fr.isima.ejbadass.stub.interfaces.IMultiPreferedService;

@Prefered
public class PreferedA implements IMultiPreferedService {
	@Override
	public String giveMeAHand() {
		return ".A.";
	}

}
