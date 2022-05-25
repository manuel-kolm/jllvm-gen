package com.jllvm.gen.enums;

public enum FirstClassType {
	i1("i1"), //
	i8("i8"), //
	i32("i32"), //
	i64("i64"), //
	i128("i128"), //
	half("half"), //
	bfloat("bfloat"), //
	_float("float"), //
	_double("double"), //
	fp128("fp128"), //
	x86_fp80("x86_fp80"), //
	ppc_fp128("ppc_fp128");

	private final String value;

	FirstClassType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
