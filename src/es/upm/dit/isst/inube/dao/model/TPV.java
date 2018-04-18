package es.upm.dit.isst.inube.dao.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class TPV implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	private int id; 
	private String IBAN;
	@ManyToOne
	private int restaurant_id;
	
	// Constructor
	public TPV() {}
	
	// setters
	public void setTPV(int id) {
		this.id = id;
	}
	
	public void setIBAN(String IBAN) {
		this.IBAN = IBAN;
	}
	
	// getters
	public int getTPV() {
		return id;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	
	public int getRestaurantId() {
		return restaurant_id;
	}

}
