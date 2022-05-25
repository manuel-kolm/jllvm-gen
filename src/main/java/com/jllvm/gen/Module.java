package com.jllvm.gen;

import java.util.ArrayList;
import java.util.List;

public class Module {

	private List<Constant> constants;
	private List<GlobalVariable> globalVariables;
	private List<Function> functions;

	public Module() {
		constants = new ArrayList<>();
		globalVariables = new ArrayList<>();
		functions = new ArrayList<>();
	}

	public void register(Constant constant) {
		constants.add(constant);
	}

	public void register(GlobalVariable globalVariable) {
		globalVariables.add(globalVariable);
	}

	public void register(Function function) {
		functions.add(function);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Constant constant : constants) {
			sb.append(constant).append("\n");
		}

		for (GlobalVariable globalVariable : globalVariables) {
			sb.append(globalVariable).append("\n");
		}

		for (Function function : functions) {
			sb.append(function).append("\n\n");
		}

		return sb.toString();
	}
}
