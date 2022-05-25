package com.jllvm.gen.types;

public class IdentifiedStruct extends BaseStruct {

	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String getDefinition() {
		return "type " + super.toString();
	}

	@Override
	public String toString() {
		return identifier;
	}
}
