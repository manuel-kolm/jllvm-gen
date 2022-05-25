package com.jllvm.gen.enums;

public enum VisibilityStyle {
	_default("default"), hidden("hidden"), _protected("protected");

	private final String value;

	VisibilityStyle(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
