package com.jllvm.gen.instructions.memory;

import com.jllvm.gen.datatypes.DataPointer;
import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.enums.AtomicMemoryOrderingConstraint;
import com.jllvm.gen.enums.AtomicrmwOperation;
import com.jllvm.gen.instructions.BaseInstruction;

public class AtomicrmwInstruction extends BaseInstruction {

	private DataValue result;
	private DataPointer pointer;
	private DataValue value;
	private AtomicrmwOperation operation;
	private boolean isVolatile;
	private AtomicMemoryOrderingConstraint ordering;

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

	public DataValue getValue() {
		return value;
	}

	public void setValue(DataValue value) {
		this.value = value;
	}

	public AtomicrmwOperation getOperation() {
		return operation;
	}

	public void setOperation(AtomicrmwOperation operation) {
		this.operation = operation;
	}

	public boolean isVolatile() {
		return isVolatile;
	}

	public void setVolatile(boolean isVolatile) {
		this.isVolatile = isVolatile;
	}

	public AtomicMemoryOrderingConstraint getOrdering() {
		return ordering;
	}

	public void setOrdering(AtomicMemoryOrderingConstraint ordering) {
		this.ordering = ordering;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier()) //
				.append(" = atomicrmw ");

		if (isVolatile) {
			sb.append("volatile ");
		}

		sb.append(operation.toString()) //
				.append(' ') //
				.append(pointer.getType()) //
				.append(' ') //
				.append(pointer.getIdentifier()) //
				.append(", ") //
				.append(value.getType()) //
				.append(' ') //
				.append(value.getIdentifierOrValue()).append(ordering);

		return sb.toString();
	}
}
