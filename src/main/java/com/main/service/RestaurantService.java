package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Restaurant;
import com.main.repository.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	public void postRestaurant(Restaurant restaurant) {
		 restaurantRepository.save(restaurant);
	}
}
