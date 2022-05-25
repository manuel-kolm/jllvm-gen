package com.jllvm.gen.instructions.memory;

import com.jllvm.gen.datatypes.DataPointer;
import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;

public class StoreInstruction extends BaseInstruction {

	private DataValue value;
	private DataPointer pointer;
	private Integer align;

	public DataValue getValue() {
		return value;
	}

	public void setValue(DataValue value) {
		this.value = value;
	}

	public DataPointer getPointer() {
		return pointer;
	}

	public void setPointer(DataPointer pointer) {
		this.pointer = pointer;
	}

	public Integer getAlign() {
		return align;
	}

	public void setAlign(Integer align) {
		this.align = align;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("store ") //
				.append(value.getType()) //
				.append(" ") //
				.append(value.getIdentifierOrValue()) //
				.append(", ") //
				.append(pointer.getType()) //
				.append(" ") //
				.append(pointer.getIdentifier());

		if (align != null) {
			sb.append(", align ").append(align);
		}

		return sb.toString();
	}
}
