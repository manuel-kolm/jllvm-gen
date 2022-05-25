package com.jllvm.gen.instructions.terminator;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;
import com.jllvm.gen.types.VoidType;

public class RetInstruction extends BaseInstruction {

	private DataValue value;

	@Override
	public String toString() {
		if (value == null || value.getType() instanceof VoidType) {
			return "ret void";
		}

		return "ret " + value.getType() + " " + value.getValue();
	}
}
