package com.jllvm.gen.enums;

public enum LinkageType {
	_private("private"),
	internal("internal"),
	available_externally("available_externally"),
	linkonce("linkonce"),
	weak("weak"),
	common("common"),
	appending("appending"),
	extern_weak("extern_weak"),
	linkonce_odr("linkonce_odr"),
	weak_odr("weak_odr"),
	external("external");
	
	private final String value;
	
	LinkageType(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
