package com.udm.juan.patterns.strategy;

import java.util.LinkedList;

import com.udm.juan.patterns.strategy.model.Order;

public class PrintService {
	
	private OrderPrinter printer;
	
	public PrintService(OrderPrinter printer) {
		this.printer = printer;
	}
	
	public void printOrders(LinkedList<Order> orders) {
		printer.print(orders);
	}

}
