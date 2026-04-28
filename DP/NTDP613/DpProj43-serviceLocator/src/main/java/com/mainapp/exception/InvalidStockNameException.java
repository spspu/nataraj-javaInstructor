package com.mainapp.exception;

public class InvalidStockNameException extends RuntimeException {
	public InvalidStockNameException(String msg) {
	    super(msg);
	}

}