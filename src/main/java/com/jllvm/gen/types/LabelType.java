package com.jllvm.gen.types;

public class LabelType implements TypeDefinitionFunctionality {

	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String getDefinition() {
		return toString();
	}

	@Override
	public String toString() {
		return identifier + ":";
	}
}
