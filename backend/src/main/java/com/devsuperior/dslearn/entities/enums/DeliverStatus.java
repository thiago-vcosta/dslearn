package com.devsuperior.dslearn.entities.enums;

public enum DeliverStatus {

	PENDING(0), ACCEPTED(1), REJECTED(2);

	private int code;

	private DeliverStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}
