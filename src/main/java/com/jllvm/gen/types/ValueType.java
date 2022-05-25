package com.jllvm.gen.types;

import java.util.Optional;

import com.jllvm.gen.enums.FirstClassType;

public class ValueType implements BaseType, TypeDefinitionFunctionality {

	private FirstClassType type;

	@Override
	public Optional<BaseType> getParentType() {
		return null;
	}

	@Override
	public FirstClassType getFirstClassType() {
		return type;
	}

	public FirstClassType getType() {
		return type;
	}

	public ValueType setType(FirstClassType type) {
		this.type = type;
		return this;
	}

	@Override
	public String getDefinition() {
		return toString();
	}

	@Override
	public String toString() {
		return type.toString();
	}
}
