package com.meritamerica.assignment5.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExceedsCombinedBalanceLimitException extends Exception {
	public ExceedsCombinedBalanceLimitException() {
		super("ExceedsCombinedBalanceLimitException");
	}
}
