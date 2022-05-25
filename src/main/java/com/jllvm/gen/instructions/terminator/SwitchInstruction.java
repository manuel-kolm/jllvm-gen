package com.jllvm.gen.instructions.terminator;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.instructions.BaseInstruction;
import com.jllvm.gen.misc.KeyValueList;
import com.jllvm.gen.types.LabelType;

public class SwitchInstruction extends BaseInstruction {

	private DataValue value;
	private LabelType defaultDestination;
	private KeyValueList<DataValue, LabelType> comparisonValues;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("switch ") //
				.append(value.getType()) //
				.append(" ") //
				.append(value.getIdentifierOrValue()) //
				.append(", label ") //
				.append(defaultDestination.getIdentifier()) //
				.append(" [ ");

		for (int i = 0; i < comparisonValues.count(); ++i) {
			DataValue value = comparisonValues.keyAt(i);
			LabelType label = comparisonValues.valueAt(i);

			sb.append("\n\t") //
			.append(value.getType()) //
			.append(" ") //
			.append(value.getValue()) //
			.append(", label ") //
			.append(label.getIdentifier());
		}

		return sb.append(" ] ").toString();
	}
}
