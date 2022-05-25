package com.jllvm.gen.instructions.bitwise;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;

public class AShrInstruction extends BaseInstruction {

	private DataValue result;
	private DataValue op1;
	private DataValue op2;
	private boolean noUnsignedWrap;
	private boolean noSignedWrap;

	public DataValue getResult() {
		return result;
	}

	public void setResult(DataValue result) {
		this.result = result;
	}

	public DataValue getOp1() {
		return op1;
	}

	public void setOp1(DataValue op1) {
		this.op1 = op1;
	}

	public DataValue getOp2() {
		return op2;
	}

	public void setOp2(DataValue op2) {
		this.op2 = op2;
	}

	public boolean isNoUnsignedWrap() {
		return noUnsignedWrap;
	}

	public void setNoUnsignedWrap(boolean noUnsignedWrap) {
		this.noUnsignedWrap = noUnsignedWrap;
	}

	public boolean isNoSignedWrap() {
		return noSignedWrap;
	}

	public void setNoSignedWrap(boolean noSignedWrap) {
		this.noSignedWrap = noSignedWrap;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier()) //
				.append(" = ashr ");

		if (noUnsignedWrap)
			sb.append("nuw ");
		if (noSignedWrap)
			sb.append("nsw ");

		return sb.append(result.getType()) //
				.append(" ") //
				.append(op1.getIdentifierOrValue()) //
				.append(", ") //
				.append(op2.getIdentifierOrValue()) //
				.toString();
	}
}
