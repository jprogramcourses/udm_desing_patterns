package com.udm.juan.patterns.factorymethod.model;

public class JsonMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}

}
