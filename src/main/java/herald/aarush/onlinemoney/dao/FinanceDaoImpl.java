package herald.aarush.onlinemoney.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import herald.aarush.onlinemoney.entities.EFinance;
import herald.aarush.onlinemoney.entities.EOrganization;

@Repository
public class FinanceDaoImpl implements FinanceDao{

	@PersistenceContext
	private EntityManager manager;
	

	public boolean saveTransaction(EFinance money) {
		try {
			manager.persist(money);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	public List<EFinance> getDeposit() {
		
		Query q =manager.createQuery("SELECT c FROM EFinance c where ftra_type='deposit' ");
		List<EFinance> dd= q.getResultList();
		return dd;

	}
	

	public List<EFinance> getWithdraw() {
		Query q =manager.createQuery("SELECT c FROM EFinance c where ftra_type='withdraw' ");
		List<EFinance> dd= q.getResultList();
		return dd;
	}
	
public List<EFinance> getPayable() {
		
		Query q =manager.createQuery("SELECT c FROM EFinance c where ftra_type='payable' ");
		List<EFinance> dd= q.getResultList();
		return dd;

	}

	public List<EFinance> getReceivable() {
		Query q =manager.createQuery("SELECT c FROM EFinance c where ftra_type='receivable' ");
		List<EFinance> dd= q.getResultList();
		return dd;
	}

	public List<EFinance> getAllTransaction() {
		Query q =manager.createQuery("SELECT c FROM EFinance c");
		List<EFinance> dd= q.getResultList();
		return dd;
	}
	public String deleteTransaction(int ftra_id) {
		Query q =manager.createQuery("Delete f FROM EFinance f where f.ftra_id= :login");
		q.setParameter("login",ftra_id);
		 return "Deleted";
		
	}

}
