package com.jllvm.gen.types;

import java.util.Optional;

import com.jllvm.gen.enums.FirstClassType;

public class PointerType implements BaseType, TypeDefinitionFunctionality {

	private BaseType type;

	@Override
	public Optional<BaseType> getParentType() {
		return Optional.of(type);
	}

	@Override
	public FirstClassType getFirstClassType() {
		return type.getFirstClassType();
	}

	public PointerType setType(BaseType type) {
		this.type = type;
		return this;
	}

	@Override
	public String getDefinition() {
		return toString();
	}

	@Override
	public String toString() {
		return type.toString() + "*";
	}
}
