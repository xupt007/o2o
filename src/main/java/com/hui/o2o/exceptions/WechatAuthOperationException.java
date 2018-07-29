package com.hui.o2o.exceptions;

public class WechatAuthOperationException extends RuntimeException {

	private static final long serialVersionUID = 30859774689101870L;

	public WechatAuthOperationException(String msg) {
		super(msg);
	}
}
