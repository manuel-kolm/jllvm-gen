package com.jllvm.gen;

import java.util.ArrayList;
import java.util.List;

import com.jllvm.gen.datatypes.DataType;
import com.jllvm.gen.enums.RuntimePreemptionSpecifier;
import com.jllvm.gen.instructions.BaseInstruction;
import com.jllvm.gen.misc.KeyValueList;
import com.jllvm.gen.types.LabelType;

public class Function {

	private String name;
	private DataType returnType;
	private KeyValueList<DataType, String> parametersTypes;
	private ArrayList<BaseInstruction> instructions;
	private RuntimePreemptionSpecifier runtimePreemptionSpecifier;
	private KeyValueList<LabelType, List<BaseInstruction>> labels;

	public Function() {
		parametersTypes = new KeyValueList<>();
		instructions = new ArrayList<>();
		labels = new KeyValueList<>();
	}
}
