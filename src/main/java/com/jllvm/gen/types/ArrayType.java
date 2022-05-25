package com.jllvm.gen.types;

public class ArrayType implements TypeDefinitionFunctionality {

	private BaseType type;
	private int size;

	public BaseType getType() {
		return type;
	}

	public ArrayType setType(BaseType type) {
		this.type = type;
		return this;
	}

	public int getSize() {
		return size;
	}

	public ArrayType setSize(int size) {
		this.size = size;
		return this;
	}

	@Override
	public String getDefinition() {
		return toString();
	}

	@Override
	public String toString() {
		return "[" + size + " x " + type + "]";
	}
}
