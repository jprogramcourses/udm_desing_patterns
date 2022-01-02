package com.udm.juan.patterns.factorymethod;

import com.udm.juan.patterns.factorymethod.model.Message;

public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	protected abstract Message createMessage();

}
