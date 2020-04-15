package herald.aarush.onlinemoney.domain;

import java.util.Date;


public class Finance {
	
	private int ftra_id;
	
	private Date ftra_time;
	
	private String ftra_reason;
	
	private double ftra_amt;
	
	private String ftra_type;

	private String username;

	
	/**
	 * @return the ftra_id
	 */
	public int getFtra_id() {
		return ftra_id;
	}

	/**
	 * @param ftra_id the ftra_id to set
	 */
	public void setFtra_id(int ftra_id) {
		this.ftra_id = ftra_id;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
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
	
}
