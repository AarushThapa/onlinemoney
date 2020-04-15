package herald.aarush.onlinemoney.dao;

import herald.aarush.onlinemoney.entities.EOrganization;

public interface OrgDao {

	public boolean saveOrg(EOrganization org);
	public EOrganization getOrganization(String org_id);
}
