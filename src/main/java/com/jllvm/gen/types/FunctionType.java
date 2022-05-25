package com.jllvm.gen.types;

import java.util.List;

public class FunctionType implements TypeDefinitionFunctionality {

	private BaseType returnType;
	private List<BaseType> parameterTypes;
	private boolean isVarArgFunction;

	public BaseType getReturnType() {
		return returnType;
	}

	public FunctionType setReturnType(BaseType returnType) {
		this.returnType = returnType;
		return this;
	}

	public List<BaseType> getParameterTypes() {
		return parameterTypes;
	}

	public FunctionType setParameterTypes(List<BaseType> parameterTypes) {
		this.parameterTypes = parameterTypes;
		return this;
	}

	public boolean isVarArgFunction() {
		return isVarArgFunction;
	}

	public FunctionType setVarArgFunction(boolean isVarArgFunction) {
		this.isVarArgFunction = isVarArgFunction;
		return this;
	}

	@Override
	public String getDefinition() {
		return toString();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(returnType.toString()) //
				.append(" (");

		if (parameterTypes == null) {
			return sb.append("...)").toString();
		}

		for (int i = 0; i < parameterTypes.size(); ++i) {
			if (i > 0) {
				sb.append(", ");
			}

			sb.append(parameterTypes.get(i));
		}

		if (isVarArgFunction) {
			sb.append(", ...");
		}

		return sb.append(")").toString();
	}
}
