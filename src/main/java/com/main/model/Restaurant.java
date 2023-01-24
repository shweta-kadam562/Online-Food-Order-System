package com.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Restaurants")
public class Restaurant {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Restaurant_name")
private String restaurantName;
private int restaurantId;
//	
//@ManyToOne
//private PlatformExecutive platformExecutive;

public int getRestaurantId() {
return restaurantId;
}

public void setRestaurantId(int restaurantId) {
this.restaurantId = restaurantId;
}

public String getRestaurantName() {
return restaurantName;
}

public void setRestaurantName(String restaurantName) {
this.restaurantName = restaurantName;
}

//public PlatformExecutive getPlatformExecutive() {
//	return platformExecutive;
//}
//
//public void setPlatformExecutive(PlatformExecutive platformExecutive) {
//	this.platformExecutive = platformExecutive;
//}
}
