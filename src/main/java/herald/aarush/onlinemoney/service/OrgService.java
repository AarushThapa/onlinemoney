package herald.aarush.onlinemoney.service;

import java.util.List;

import herald.aarush.onlinemoney.domain.Finance;
import herald.aarush.onlinemoney.domain.Organization;
import herald.aarush.onlinemoney.service.exceptions.UserAlreadyPresentException;

public interface OrgService {
	
	public boolean registerOrg(Organization org) throws UserAlreadyPresentException;
	public List<Finance> AllTransactions();
	public List<Finance> checkDeposit();
	public boolean saveTransaction(Finance finance);
	public List<Finance> checkWithdraw();
	public List<Finance> checkPayable();
	public List<Finance> checkReceivable();

}
