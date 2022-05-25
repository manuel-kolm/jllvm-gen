package com.jllvm.gen.instructions.binary;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;

public class AddInstruction extends BaseInstruction {

	private DataValue result;
	private DataValue op1;
	private DataValue op2;

	private boolean noUnsignedWrap;
	private boolean noSignedWrap;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier()) //
				.append(" = add ");

		if (noUnsignedWrap) {
			sb.append("nuw ");
		}
		if (noSignedWrap) {
			sb.append("nsw ");
		}

		sb.append(result.getType()) //
				.append(" ") //
				.append(op1.getIdentifierOrValue()) //
				.append(", ") //
				.append(op2.getIdentifierOrValue());

		return sb.toString();
	}
}
