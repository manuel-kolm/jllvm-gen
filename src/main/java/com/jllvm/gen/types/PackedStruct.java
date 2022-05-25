package com.jllvm.gen.types;

public class PackedStruct extends BaseStruct {

	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public PackedStruct setIdentifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	@Override
	public String getDefinition() {
		return "type <" + super.toString() + ">";
	}

	@Override
	public String toString() {
		return identifier;
	}
}
