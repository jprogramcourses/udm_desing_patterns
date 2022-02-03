package com.udm.juan.patterns.state.context;

import com.udm.juan.patterns.state.states.Cancelled;
import com.udm.juan.patterns.state.states.Delivered;
import com.udm.juan.patterns.state.states.InTransit;
import com.udm.juan.patterns.state.states.New;
import com.udm.juan.patterns.state.states.OrderState;
import com.udm.juan.patterns.state.states.Paid;

public class Order {
	
	private OrderState currentState;
	
	public Order() {
		currentState = new New();
	}

	public double cancel() {
		double charges = currentState.handleCancellation();
		currentState = new Cancelled();
		return charges;
	}
	
	public void paymentSuccessful() {
		currentState = new Paid();
	}
	
	public void dispatched() {
		currentState = new InTransit();
	}
	
	public void delivered() {
		currentState = new Delivered();
	}

}
