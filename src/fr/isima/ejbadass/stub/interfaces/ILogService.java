package fr.isima.ejbadass.stub.interfaces;

import fr.isima.ejbadass.log.Log;

public interface ILogService {
	@Log
	void loggedMethod();
}
