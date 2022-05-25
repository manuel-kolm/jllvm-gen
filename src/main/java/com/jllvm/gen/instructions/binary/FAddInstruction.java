package com.jllvm.gen.instructions.binary;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.enums.FastMathFlag;
import com.jllvm.gen.instructions.BaseInstruction;

public class FAddInstruction extends BaseInstruction {

	private DataValue result;
	private DataValue op1;
	private DataValue op2;
	private FastMathFlag[] fastMathFlags;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier()) //
				.append(" = fadd ");

		if (fastMathFlags != null) {
			for (FastMathFlag flag : fastMathFlags) {
				sb.append(flag).append(" ");
			}
		}

		sb.append(result.getType()) //
				.append(" ") //
				.append(op1.getIdentifierOrValue()) //
				.append(", ") //
				.append(op2.getIdentifierOrValue());

		return sb.toString();
	}
}
