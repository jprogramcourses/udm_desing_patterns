package com.udm.juan.patterns.factorymethod;

import com.udm.juan.patterns.factorymethod.model.Message;

public class App {
    
    public static void main(String[] args) {
    	
    	printMessage(new JSONMessageCreator());
    	
    	printMessage(new TextMessageCreator());
    	
    }
    
    public static void printMessage(MessageCreator creator) {
    	Message msg = creator.getMessage();
    	System.out.println(msg);
    }
    
}
