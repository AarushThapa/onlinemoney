package herald.aarush.onlinemoney.dao;

import java.util.List;

import herald.aarush.onlinemoney.entities.EFinance;

public interface FinanceDao {
	public boolean saveTransaction(EFinance money);
	public List<EFinance> getAllTransaction();
	public List<EFinance> getDeposit();
	public List<EFinance> getWithdraw();
	public List<EFinance> getPayable();
	public List<EFinance> getReceivable();
}
