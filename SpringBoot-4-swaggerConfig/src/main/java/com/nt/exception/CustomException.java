package com.nt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ResponseStatus(value = HttpStatus.BAD_REQUEST , reason = "Write Correct User Id " )
//public class CustomException extends RuntimeException {
//
//	public  CustomException(String msg) {
//		super(msg);
//	}
//	
//}

@ControllerAdvice
@RestControllerAdvice  // It will send JSON to the Client
public class CustomException {

	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(value = HttpStatus.BAD_GATEWAY , reason = "ID not Null")
	public void NullPointerException() {
		
		
	}
	
	@ExceptionHandler(ArithmeticException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Invalid ID enter correct ID")
	public void ArithmeticException() {
		
	}
	
	
	
}