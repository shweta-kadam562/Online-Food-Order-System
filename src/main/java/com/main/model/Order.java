package com.main.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.main.enums.OrderStatus;

@Entity
@Table(name="Order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int OrderNo;

	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;

	public int getOrderNo() {
		return OrderNo;
	}

	public void setOrderNo(int orderNo) {
		OrderNo = orderNo;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}
