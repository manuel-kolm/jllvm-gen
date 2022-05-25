package com.jllvm.gen;

import com.jllvm.gen.datatypes.DataValue;
import com.jllvm.gen.enums.DllStorageClass;
import com.jllvm.gen.enums.LinkageType;
import com.jllvm.gen.enums.RuntimePreemptionSpecifier;
import com.jllvm.gen.enums.ThreadLocalStorageModel;
import com.jllvm.gen.enums.VisibilityStyle;

public class GlobalVariable {

	private String identifier;
	private LinkageType linkage;
	private RuntimePreemptionSpecifier preemptionSpecifier;
	private VisibilityStyle visibility;
	private DllStorageClass dllStorageClass;
	private ThreadLocalStorageModel threadLocal;
	private Integer addressSpace;
	private DataValue dataValue;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(identifier).append(" = ");

		if (linkage != null) {
			sb.append(linkage).append(" ");
		}

		if (preemptionSpecifier != null) {
			sb.append(preemptionSpecifier).append(" ");
		}

		if (visibility != null) {
			sb.append(visibility).append(" ");
		}

		if (dllStorageClass != null) {
			sb.append(dllStorageClass).append(" ");
		}

		if (threadLocal != null) {
			sb.append(threadLocal).append(" ");
		}

		if (addressSpace != null) {
			sb.append("addrspace(").append(addressSpace).append(") ");
		}

		sb.append("global ") //
				.append(dataValue.getFirstClassType()) //
				.append(dataValue.getValue());

		return sb.toString();
	}
}
