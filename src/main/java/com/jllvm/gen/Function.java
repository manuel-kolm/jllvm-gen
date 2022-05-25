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
	private List<BaseInstruction> instructions;
	private RuntimePreemptionSpecifier runtimePreemptionSpecifier;
	private KeyValueList<LabelType, List<BaseInstruction>> labels;

	public Function() {
		parametersTypes = new KeyValueList<>();
		instructions = new ArrayList<>();
		labels = new KeyValueList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataType getReturnType() {
		return returnType;
	}

	public void setReturnType(DataType returnType) {
		this.returnType = returnType;
	}

	public KeyValueList<DataType, String> getParametersTypes() {
		return parametersTypes;
	}

	public void setParametersTypes(
			KeyValueList<DataType, String> parametersTypes) {
		this.parametersTypes = parametersTypes;
	}

	public List<BaseInstruction> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<BaseInstruction> instructions) {
		this.instructions = instructions;
	}

	public RuntimePreemptionSpecifier getRuntimePreemptionSpecifier() {
		return runtimePreemptionSpecifier;
	}

	public void setRuntimePreemptionSpecifier(
			RuntimePreemptionSpecifier runtimePreemptionSpecifier) {
		this.runtimePreemptionSpecifier = runtimePreemptionSpecifier;
	}

	public KeyValueList<LabelType, List<BaseInstruction>> getLabels() {
		return labels;
	}

	public void setLabels(
			KeyValueList<LabelType, List<BaseInstruction>> labels) {
		this.labels = labels;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("define ") //
				.append(returnType) //
				.append(" ") //
				.append(name) //
				.append("(");

		for (int i = 0; i < parametersTypes.count(); ++i) {
			if (i > 0) {
				sb.append(", ");
			}

			sb.append(parametersTypes.keyAt(i)).append(" ")
					.append(parametersTypes.valueAt(i));
		}

		sb.append(") {\n");

		for (BaseInstruction instruction : instructions) {
			sb.append("\t").append(instruction).append("\n");
		}

		for (int i = 0; i < labels.count(); ++i) {
			sb.append(labels.keyAt(i)).append('\n') //
					.append("\t").append(labels.valueAt(i));
		}

		return sb.append("}").toString();
	}
}
