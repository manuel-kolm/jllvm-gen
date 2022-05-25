package com.jllvm.gen.datatypes;

import com.jllvm.gen.enums.FirstClassType;

public interface DataType {

	public String getIdentifier();
	public String getIdentifierOrValue();
	public FirstClassType getFirstClassType();
}
