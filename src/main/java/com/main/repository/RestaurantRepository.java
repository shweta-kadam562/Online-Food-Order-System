package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{

}
