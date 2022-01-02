package com.udm.juan.patterns.factorymethod;

import com.udm.juan.patterns.factorymethod.model.Message;
import com.udm.juan.patterns.factorymethod.model.TextMessage;

public class TextMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		return new TextMessage();
	}

}
