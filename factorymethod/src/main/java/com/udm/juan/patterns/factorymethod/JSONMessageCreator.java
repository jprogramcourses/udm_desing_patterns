package com.udm.juan.patterns.factorymethod;

import com.udm.juan.patterns.factorymethod.model.JsonMessage;
import com.udm.juan.patterns.factorymethod.model.Message;

public class JSONMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		
		return new JsonMessage();
	}

}
