package com.marcosvieirajr.caprepag.domain._base.exception;

public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public SystemException(final String message) {
		super(message);
	}
}