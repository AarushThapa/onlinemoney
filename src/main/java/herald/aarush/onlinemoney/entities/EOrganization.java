package herald.aarush.onlinemoney.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="organization")
public class EOrganization implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer org_id;
	
	private String org_details;
	
	private String org_name;
	
	private String org_pw;
	
	private String org_address;
	
	private String org_email;
	
	private Integer org_contact;

	private int role;
	
	@Column(columnDefinition = "TINYINT")
	private boolean status;
	
	public Integer getOrg_id() {
		return org_id;
	}

	public void setOrg_id(Integer org_id) {
		this.org_id = org_id;
	}

	public String getOrg_details() {
		return org_details;
	}


	public void setOrg_details(String org_details) {
		this.org_details = org_details;
	}


	public String getOrg_name() {
		return org_name;
	}


	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}


	public String getOrg_pw() {
		return org_pw;
	}


	public void setOrg_pw(String org_pw) {
		this.org_pw = org_pw;
	}


	public String getOrg_address() {
		return org_address;
	}

	public void setOrg_address(String org_address) {
		this.org_address = org_address;
	}


	public String getOrg_email() {
		return org_email;
	}


	public void setOrg_email(String org_email) {
		this.org_email = org_email;
	}


	public Integer getOrg_contact() {
		return org_contact;
	}

	public void setOrg_contact(Integer org_contact) {
		this.org_contact = org_contact;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
