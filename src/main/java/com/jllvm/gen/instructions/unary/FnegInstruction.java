package com.jllvm.gen.instructions.unary;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.enums.FastMathFlag;
import com.jllvm.gen.instructions.BaseInstruction;

public class FnegInstruction extends BaseInstruction {

	private DataValue result;
	private DataValue value;
	private FastMathFlag[] fastMathFlags;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier());

		sb.append(" = fneg ");

		if (fastMathFlags != null) {
			for (FastMathFlag flag : fastMathFlags) {
				sb.append(flag);
				sb.append(" ");
			}
		}

		sb.append(result.getType());
		sb.append(" ");
		sb.append(value.getIdentifierOrValue());

		return sb.toString();
	}

}
