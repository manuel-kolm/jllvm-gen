package com.jllvm.gen.datatypes;

import com.jllvm.gen.enums.FirstClassType;
import com.jllvm.gen.enums.PointerVariableType;
import com.jllvm.gen.types.PointerType;

public class DataPointer implements DataType {

	private String identifier;
	private PointerType type;
	private PointerVariableType variableType;

	@Override
	public String getIdentifier() {
		return identifier;
	}

	@Override
	public String getIdentifierOrValue() {
		return getIdentifier();
	}

	@Override
	public FirstClassType getFirstClassType() {
		return type.getFirstClassType();
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public PointerType getType() {
		return type;
	}

	public void setType(PointerType type) {
		this.type = type;
	}

	public PointerVariableType getVariableType() {
		return variableType;
	}

	public void setVariableType(PointerVariableType variableType) {
		this.variableType = variableType;
	}

	@Override
	public String toString() {
		return identifier;
	}
}
