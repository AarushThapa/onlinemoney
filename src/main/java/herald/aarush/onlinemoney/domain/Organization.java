package herald.aarush.onlinemoney.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Organization {
	
	private int org_id;
	
	@Size(min=10,max=50,message="Organizaiton details must be between 10 and 50 characters long.")
	private String org_details;
	
	@Size(min=3,max=20,message="Username must be between 3 and 20 characters long.")
	@Pattern(regexp="^[a-zA-Z0-9]+$",message="Username must be alphanumeric with no spaces")
	private String org_name;
	
	
	@Size(min=5,max=20,message="Password must be between 5 and 20")
	private String org_pw;
	
	@Size(min=3,max=20,message="Address must be between 3 and 20 characters long.")
	private String org_address;
	
	@Email(message="Please provide a valid email address")
	private String org_email;
	
	private int org_contact;
	
	private String status;
	
	public int getOrg_id() {
		return org_id;
	}
	public void setOrg_id(int org_id) {
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

	public int getOrg_contact() {
		return org_contact;
	}

	public void setOrg_contact(int org_contact) {
		this.org_contact = org_contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
