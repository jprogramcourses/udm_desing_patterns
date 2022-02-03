package com.udm.juan.patterns.strategy.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
	
	private String id;
	private LocalDate date;
	private Map<String, Double> items;
	private double total;
	
	public Order(String id) {
		this.id = id;
		items = new HashMap<>();
		this.date = LocalDate.now();
	}

	public String getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public Map<String, Double> getItems() {
		return items;
	}

	public void addItem(String name, double price) {
		this.items.put(name, price);
		total += price;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
