package com.jllvm.gen.datatypes;

import com.jllvm.gen.enums.FirstClassType;
import com.jllvm.gen.enums.ValueVariableType;
import com.jllvm.gen.types.BaseType;

public class DataValue implements DataType {
	private String identifier;
	private BaseType type;
	private String value;
	private ValueVariableType variableType;

	@Override
	public String getIdentifier() {
		return identifier;
	}

	@Override
	public String getIdentifierOrValue() {
		if (variableType == ValueVariableType.value_only) {
			return value;
		}

		return getIdentifier();
	}

	@Override
	public FirstClassType getFirstClassType() {
		return type.getFirstClassType();
	}

	public DataValue setIdentifier(String identifier) {
		this.identifier = identifier;
		return this;
	}

	public BaseType getType() {
		return type;
	}

	public DataValue setType(BaseType type) {
		this.type = type;
		return this;
	}

	public String getValue() {
		return value;
	}

	public DataValue setValue(String value) {
		this.value = value;
		return this;
	}

	public ValueVariableType getVariableType() {
		return variableType;
	}

	public DataValue setVariableType(ValueVariableType variableType) {
		this.variableType = variableType;
		return this;
	}
}
