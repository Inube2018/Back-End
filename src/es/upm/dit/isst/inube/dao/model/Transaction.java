package es.upm.dit.isst.inube.dao.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	
	private int id;
	private float quantity;
	private String date;
	private String time;
	
	@ManyToOne
	private int TPV_id;

	// Constructor
	public Transaction() {}
	
	//setters
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public float getQuantity() {
		return quantity;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	public int getTPV_id() {
		return TPV_id;
	}
}