package fr.isima.ejbadass.stub.interfaces;

import fr.isima.ejbadass.transaction.TransactionType;
import fr.isima.ejbadass.transaction.Transactional;

public interface ITransacService {
	@Transactional(value=TransactionType.REQUIRED)
	public void transactionalMethod(int i) throws Exception;
	@Transactional(value=TransactionType.REQUIRED)
	public void transactionalMethod2();
	@Transactional(value=TransactionType.REQUIRES_NEW)
	public void transactionalMethod3();
	@Transactional(value=TransactionType.REQUIRED)
	public void transactionalMethod4() throws Exception;
}