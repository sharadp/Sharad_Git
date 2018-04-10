package com.swv.oscar.dataobject.common;

import java.io.Serializable;
import java.util.List;

public class BaseBO<T>  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1700243419827220748L;
	private Global global;
	

	public Global getGlobal() {
		return global;
	}

	public void setGlobal(Global global) {
		this.global = global;
	}

	public T getFirst(List<T> obj) {
		if (obj != null && obj.size() > 0) {
			return obj.get(0);
		}
		return null;
	}

}
