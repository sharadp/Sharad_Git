package com.swv.oscar.exceptions;

public class OscarRESTException extends Exception {

	public OscarRESTException() {
		super();
	}

	public OscarRESTException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public OscarRESTException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public OscarRESTException(String arg0) {
		super(arg0);
	}

	public OscarRESTException(Throwable arg0) {
		super(arg0);
	}

}
