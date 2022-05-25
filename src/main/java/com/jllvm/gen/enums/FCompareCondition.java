package com.jllvm.gen.enums;

public enum FCompareCondition {
	_false("false"), oeq("oeq"), ogt("ogt"), oge("oge"), olt("olt"), ole("ole"), one("one"), ord("ord"), ueq("ueq"),
	ugt("ugt"), uge("uge"), ult("ult"), ule("ule"), une("une"), uno("uno"), _true("true");

	private final String value;

	FCompareCondition(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
