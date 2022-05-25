package com.jllvm.gen.instructions.memory;

import com.jllvm.gen.datatypes.DataPointer;
import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;

public class LoadInstruction extends BaseInstruction {

	private DataValue result;
	private DataPointer pointer;

	public DataValue getResult() {
		return result;
	}

	public void setResult(DataValue result) {
		this.result = result;
	}

	public DataPointer getPointer() {
		return pointer;
	}

	public void setPointer(DataPointer pointer) {
		this.pointer = pointer;
	}

	@Override
	public String toString() {
		return new StringBuilder(result.getIdentifier()).append(" = load ") //
				.append(result.getType()) //
				.append(", ") //
				.append(pointer.getType()) //
				.append(" ") //
				.append(pointer.getIdentifier()) //
				.toString();
	}
}
