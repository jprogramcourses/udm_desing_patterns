package com.udm.juan.patterns.state;

import com.udm.juan.patterns.state.context.Order;

public class Client {
    
    public static void main(String[] args) {
    	Order order = new Order();
    	
    	order.paymentSuccessful();
    	
    	order.cancel();
    }
    
}
