package com.hui.o2o.exceptions;

public class ProductCategoryOperationException extends RuntimeException{

	private static final long serialVersionUID = 4603819579966473669L;

	public ProductCategoryOperationException(String msg) {
		super(msg);
	}
}
