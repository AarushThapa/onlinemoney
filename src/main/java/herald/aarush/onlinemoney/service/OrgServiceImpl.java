package herald.aarush.onlinemoney.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import herald.aarush.onlinemoney.dao.FinanceDao;
import herald.aarush.onlinemoney.dao.OrgDao;
import herald.aarush.onlinemoney.domain.Finance;
import herald.aarush.onlinemoney.domain.Organization;
import herald.aarush.onlinemoney.entities.EFinance;
import herald.aarush.onlinemoney.entities.EOrganization;
import herald.aarush.onlinemoney.service.exceptions.UserAlreadyPresentException;



@Service
@Transactional
class OrgServiceImpl implements OrgService{

	@Autowired
	private OrgDao orgdaoimpl;
	
	
	@Autowired
	private FinanceDao financedaoimpl;
	

	public boolean registerOrg(Organization org) throws UserAlreadyPresentException{
		
		EOrganization currentUser = orgdaoimpl.getOrganization(org.getOrg_name());
		if(currentUser!=null)
			throw new UserAlreadyPresentException("The organization name is already registered!");
		
		EOrganization dborg = new EOrganization();
		
		dborg.setOrg_name(org.getOrg_name());
		dborg.setOrg_details(org.getOrg_details());
		dborg.setOrg_address(org.getOrg_address());
		dborg.setOrg_contact(org.getOrg_contact());
		dborg.setOrg_email(org.getOrg_email());
		dborg.setRole(1);
		dborg.setStatus(true);
		/*String hashedpw = BCrypt.hashpw(org.getOrg_pw(), BCrypt.gensalt());*/
		dborg.setOrg_pw(org.getOrg_pw());
		
		boolean result= orgdaoimpl.saveOrg(dborg);
		
		return result;
	}
	

	public List<Finance> checkDeposit() {
		
		List<EFinance> alldbdeposit = (List<EFinance>) financedaoimpl.getDeposit();
		
		if(alldbdeposit == null || alldbdeposit.size()==0)
			return null;
		
		List<Finance> alldeposit = new ArrayList<Finance>();
		for(EFinance dd:alldbdeposit) {
			Finance p = new Finance();
			p.setFtra_id(dd.getFtra_id());
			p.setFtra_time(dd.getFtra_time());
			p.setFtra_amt(dd.getFtra_amt());
			p.setUsername(dd.getUsername());
			p.setFtra_reason(dd.getFtra_reason());
			alldeposit.add(p);
		}
		
		return alldeposit;	
	}
	

	public List<Finance> checkWithdraw() {
		List<EFinance> alldbwithdraw = (List<EFinance>) financedaoimpl.getWithdraw();
		
		if(alldbwithdraw == null || alldbwithdraw.size()==0)
			return null;
		
		List<Finance> allwithdraw = new ArrayList<Finance>();
		for(EFinance dd:alldbwithdraw) {
			Finance p = new Finance();
			p.setFtra_id(dd.getFtra_id());
			p.setFtra_time(dd.getFtra_time());
			p.setFtra_amt(dd.getFtra_amt());
			p.setUsername(dd.getUsername());
			p.setFtra_reason(dd.getFtra_reason());
			allwithdraw.add(p);
		}
		
		return allwithdraw;	

	}

	public boolean saveTransaction(Finance finance) {
		Date date =new Date(System.currentTimeMillis());
		
		EFinance dbdeposit = new EFinance();
		
		dbdeposit.setFtra_time(date);
		dbdeposit.setFtra_amt(finance.getFtra_amt());
		dbdeposit.setFtra_reason(finance.getFtra_reason());
		dbdeposit.setFtra_type(finance.getFtra_type());
		dbdeposit.setUsername(finance.getUsername());


		boolean result= financedaoimpl.saveTransaction(dbdeposit);
		
		return result;
	}

	public List<Finance> AllTransactions() {
		List<EFinance> alltrans = (List<EFinance>) financedaoimpl.getAllTransaction();
		
		if(alltrans == null || alltrans.size()==0)
			return null;
		
		List<Finance> allt = new ArrayList<Finance>();
		for(EFinance dd:alltrans) {
			Finance p = new Finance();
			p.setFtra_id(dd.getFtra_id());
			p.setFtra_time(dd.getFtra_time());
			p.setFtra_amt(dd.getFtra_amt());
			p.setUsername(dd.getUsername());
			p.setFtra_type(dd.getFtra_type());
			p.setFtra_reason(dd.getFtra_reason());
			allt.add(p);
		}
		
		return allt;	
	}

	public List<Finance> checkPayable() {
List<EFinance> alldbpayable = (List<EFinance>) financedaoimpl.getPayable();
		
		if(alldbpayable == null || alldbpayable.size()==0)
			return null;
		
		List<Finance> allpayable = new ArrayList<Finance>();
		for(EFinance dd:alldbpayable) {
			Finance p = new Finance();
			p.setFtra_id(dd.getFtra_id());
			p.setFtra_time(dd.getFtra_time());
			p.setFtra_amt(dd.getFtra_amt());
			p.setUsername(dd.getUsername());
			p.setFtra_reason(dd.getFtra_reason());
			allpayable.add(p);
		}
		
		return allpayable;	

	}

	public List<Finance> checkReceivable() {
List<EFinance> alldbreceivable = (List<EFinance>) financedaoimpl.getReceivable();
		
		if(alldbreceivable == null || alldbreceivable.size()==0)
			return null;
		
		List<Finance> allreveivable = new ArrayList<Finance>();
		for(EFinance dd:alldbreceivable) {
			Finance p = new Finance();
			p.setFtra_id(dd.getFtra_id());
			p.setFtra_time(dd.getFtra_time());
			p.setFtra_amt(dd.getFtra_amt());
			p.setUsername(dd.getUsername());
			p.setFtra_reason(dd.getFtra_reason());
			allreveivable.add(p);
		}
		return allreveivable;	
	}
}
