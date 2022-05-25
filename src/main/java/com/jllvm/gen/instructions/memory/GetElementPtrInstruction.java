package com.jllvm.gen.instructions.memory;

import com.jllvm.gen.datatypes.DataPointer;
import com.jllvm.gen.instructions.BaseInstruction;
import com.jllvm.gen.types.BaseType;

public class GetElementPtrInstruction extends BaseInstruction {

	private DataPointer result;
	private BaseType type;
	private DataPointer pointer;
	private int[] indexes;

	public DataPointer getResult() {
		return result;
	}

	public void setResult(DataPointer result) {
		this.result = result;
	}

	public BaseType getType() {
		return type;
	}

	public void setType(BaseType type) {
		this.type = type;
	}

	public DataPointer getPointer() {
		return pointer;
	}

	public void setPointer(DataPointer pointer) {
		this.pointer = pointer;
	}

	public int[] getIndexes() {
		return indexes;
	}

	public void setIndexes(int[] indexes) {
		this.indexes = indexes;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier()) //
				.append(" = getelementptr ") //
				.append(type) //
				.append(", ") //
				.append(pointer.getType()) //
				.append(" ") //
				.append(pointer.getIdentifier());

		for (int index : indexes) {
			sb.append(", i32 ").append(index);
		}

		return sb.toString();
	}
}
