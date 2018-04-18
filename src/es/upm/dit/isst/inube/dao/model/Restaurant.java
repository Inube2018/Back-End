package es.upm.dit.isst.inube.dao.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Restaurant implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private int zip_code;
	private String type;
	private float menu_price;
	
	@ManyToOne
	private int user_id;
	
	//Contructor
	public Restaurant() {}

	//setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setZipCode(int zip_code) {
		this.zip_code = zip_code; 
	}
	
	public void setType(String type) {
		this.type= type;
	}
	
	public void setMenuPrice(float menu_price) {
		this.menu_price = menu_price;
	}
	
	//getter
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getZipCode() {
		return zip_code;
	}
	
	public String getType() {
		return type;
	}
	
	public float getMenuPrice() {
		return menu_price;
	}
	
	public int getUserId() {
		return user_id;
	}
	
	
}
