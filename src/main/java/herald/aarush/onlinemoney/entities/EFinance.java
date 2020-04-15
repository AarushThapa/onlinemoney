package herald.aarush.onlinemoney.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="finance")
public class EFinance implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer ftra_id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date ftra_time;
	
	private String ftra_reason;
	
	private double ftra_amt;
	
	private String ftra_type;
	
	private String username;

	/**
	 * @return the ftra_time
	 */
	public Date getFtra_time() {
		return ftra_time;
	}

	/**
	 * @param ftra_time the ftra_time to set
	 */
	public void setFtra_time(Date ftra_time) {
		this.ftra_time = ftra_time;
	}

	/**
	 * @return the ftra_reason
	 */
	public String getFtra_reason() {
		return ftra_reason;
	}

	/**
	 * @param ftra_reason the ftra_reason to set
	 */
	public void setFtra_reason(String ftra_reason) {
		this.ftra_reason = ftra_reason;
	}

	/**
	 * @return the ftra_amt
	 */
	public double getFtra_amt() {
		return ftra_amt;
	}

	/**
	 * @param ftra_amt the ftra_amt to set
	 */
	public void setFtra_amt(double ftra_amt) {
		this.ftra_amt = ftra_amt;
	}

	/**
	 * @return the ftra_type
	 */
	public String getFtra_type() {
		return ftra_type;
	}

	/**
	 * @param ftra_type the ftra_type to set
	 */
	public void setFtra_type(String ftra_type) {
		this.ftra_type = ftra_type;
	}

	/**
	 * @return the dtra_id
	 */
	public Integer getFtra_id() {
		return ftra_id;
	}

	/**
	 * @param dtra_id the dtra_id to set
	 */
	public void setFtra_id(Integer ftra_id) {
		this.ftra_id = ftra_id;
	}

	/**
	 * @return the user_id
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	
}
