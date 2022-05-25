package com.jllvm.gen.types;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseStruct implements TypeDefinitionFunctionality {

	private List<BaseType> members = new ArrayList<>();

	public List<BaseType> getMembers() {
		return members;
	}

	public BaseStruct setMembers(List<BaseType> members) {
		this.members = members;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");

		for (int i = 0; i < members.size(); ++i) {
			if (i == 0) {
				sb.append(" ").append(members.get(i));
			} else {
				sb.append(", ").append(members.get(i));
			}
		}

		return sb.append("}").toString();
	}
}
