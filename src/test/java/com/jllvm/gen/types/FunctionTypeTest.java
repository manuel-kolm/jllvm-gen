package com.jllvm.gen.types;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.jllvm.gen.enums.FirstClassType;

class FunctionTypeTest {

	@Test
	void shouldGenerateType_i32_float() {
		FunctionType functionType = new FunctionType()
				.setReturnType(create(FirstClassType.i32))
				.setParameterTypes(List.of(create(FirstClassType._float)));

		Assertions.assertEquals("i32 (float)", functionType.toString());
	}

	@Test
	void shouldGenerateType_float_doubleVarArg() {
		FunctionType functionType = new FunctionType()
				.setReturnType(create(FirstClassType._float))
				.setParameterTypes(List.of(create(FirstClassType._double)))
				.setVarArgFunction(true);

		Assertions.assertEquals("float (double, ...)", functionType.toString());
	}

	@Test
	void shouldGenerateType_float_NoArguments() {
		FunctionType functionType = new FunctionType()
				.setReturnType(create(FirstClassType._float));

		Assertions.assertEquals("float (...)", functionType.toString());
	}

	private static BaseType create(FirstClassType firstClassType) {
		return new ValueType() //
				.setType(firstClassType);
	}
}
