package com.devsuperior.dslearn.entities.enums;

public enum ResourceType {

	LESSON_ONLY(0), LESSON_TASK(1), FORUM(2), EXTERNAL_LINK(3);

	private int code;

	private ResourceType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}