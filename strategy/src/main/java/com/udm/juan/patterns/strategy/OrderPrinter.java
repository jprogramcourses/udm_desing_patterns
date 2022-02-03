package com.udm.juan.patterns.strategy;

import java.util.Collection;

import com.udm.juan.patterns.strategy.model.Order;

public interface OrderPrinter {
	
	void print(Collection<Order> orders);

}
