package com.jllvm.gen.types;

import java.util.Optional;

import com.jllvm.gen.enums.FirstClassType;

public interface BaseType {

	public Optional<BaseType> getParentType();
	public FirstClassType getFirstClassType();
}
