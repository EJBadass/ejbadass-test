package fr.isima.ejbadass.stub.implementations;

import fr.isima.ejbadass.annotation.Inject;
import fr.isima.ejbadass.stub.interfaces.ITransacService;
import fr.isima.ejbadass.transaction.TransactionType;
import fr.isima.ejbadass.transaction.Transactional;

public class TransacService implements ITransacService {
	@Inject
	ITransacService service2;

	/* (non-Javadoc)
	 * @see fr.isima.ejb.service.ITransacService#transactionalMethod(int)
	 */
	@Override
	@Transactional(value=TransactionType.REQUIRED)
	public void transactionalMethod(int i) throws Exception {
		if(i==0) throw new Exception();
	}
	
	/* (non-Javadoc)
	 * @see fr.isima.ejb.service.ITransacService#transactionalMethod2()
	 */
	@Override
	@Transactional(value=TransactionType.REQUIRED)
	public void transactionalMethod2() {
		service2.transactionalMethod3();
	}
	
	/* (non-Javadoc)
	 * @see fr.isima.ejb.service.ITransacService#transactionalMethod3()
	 */
	@Override
	@Transactional(value=TransactionType.REQUIRES_NEW)
	public void transactionalMethod3() {
		
	}
	
	/* (non-Javadoc)
	 * @see fr.isima.ejb.service.ITransacService#transactionalMethod4()
	 */
	@Override
	@Transactional(value=TransactionType.REQUIRED)
	public void transactionalMethod4() throws Exception {
		service2.transactionalMethod(1);
	}
}
