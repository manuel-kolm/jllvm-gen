package com.jllvm.gen.instructions.others;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.enums.FCompareCondition;
import com.jllvm.gen.instructions.BaseInstruction;

public class FCmpInstruction extends BaseInstruction {

	private DataValue result;
	private FCompareCondition compareCondition;
	private DataValue op1;
	private DataValue op2;

	public DataValue getResult() {
		return result;
	}

	public void setResult(DataValue result) {
		this.result = result;
	}

	public FCompareCondition getCompareCondition() {
		return compareCondition;
	}

	public void setCompareCondition(FCompareCondition compareCondition) {
		this.compareCondition = compareCondition;
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

	@Override
	public String toString() {
		return new StringBuilder(result.getIdentifier()).append(" = fcmp ")
				.append(compareCondition).append(" ").append(op1.getType())
				.append(" ").append(op1.getIdentifierOrValue()).append(", ")
				.append(op2.getIdentifierOrValue()).toString();
	}
}
