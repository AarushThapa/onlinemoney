package herald.aarush.onlinemoney.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import herald.aarush.onlinemoney.entities.EOrganization;

@Repository
public class OrgDaoImpl implements OrgDao{

	@PersistenceContext
	private EntityManager manager;
	
	public boolean saveOrg(EOrganization org) {
		try {
			manager.persist(org);
			return true;
		}catch(Exception e){
		return false;
		}
	}

	public EOrganization getOrganization(String org_name) {
		 Query q =manager.createQuery("SELECT o FROM EOrganization o WHERE o.org_name = :login");
		 q.setParameter("login",org_name);
		 List<EOrganization> users=q.getResultList();
		 if(users==null || users.size()==0)
			 return null;
		 return users.get(0);
	}

}
