package com.jllvm.gen.instructions.memory;

import com.jllvm.gen.datatypes.DataPointer;
import com.jllvm.gen.instructions.BaseInstruction;
import com.jllvm.gen.misc.KeyValueList;
import com.jllvm.gen.types.BaseType;

public class AllocaInstruction extends BaseInstruction {

	private DataPointer result;
	private KeyValueList<BaseType, Integer> subTypes;
	private Integer align;

	public DataPointer getResult() {
		return result;
	}

	public void setResult(DataPointer result) {
		this.result = result;
	}

	public KeyValueList<BaseType, Integer> getSubTypes() {
		return subTypes;
	}

	public void setSubTypes(KeyValueList<BaseType, Integer> subTypes) {
		this.subTypes = subTypes;
	}

	public Integer getAlign() {
		return align;
	}

	public void setAlign(Integer align) {
		this.align = align;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(result.getIdentifier()) //
				.append(" = alloca ") //
				.append(result.getType());

		if (subTypes != null) {
			for (int i = 0; i < subTypes.count(); ++i) {
				sb.append(", ") //
						.append(subTypes.keyAt(i)) //
						.append(" ") //
						.append(subTypes.valueAt(i));
			}
		}

		if (align != null) {
			sb.append(", align ").append(align);
		}

		return sb.toString();
	}
}
