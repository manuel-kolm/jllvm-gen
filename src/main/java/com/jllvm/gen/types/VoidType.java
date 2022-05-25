package com.jllvm.gen.types;

public class VoidType implements TypeDefinitionFunctionality {

	@Override
	public String getDefinition() {
		return toString();
	}

	@Override
	public String toString() {
		return "void";
	}
}
