package com.turktrust.eticaret.core.utilities.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

import com.turktrust.eticaret.core.utilities.results.ErrorDataResult;

@RestControllerAdvice
public class GlobalExceptionHandler {

	 @ExceptionHandler
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ErrorDataResult<Object> handleIllegalArgumentException(IllegalArgumentException illegalArgumentException){

	        ErrorDataResult<Object> error = new ErrorDataResult<>(illegalArgumentException.getMessage(),"IllegalArgument.Error");

	        return error;
	    }
	 @ExceptionHandler
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ErrorDataResult<Object> handleDataIntegrityViolationException(Exception exception){

	        ErrorDataResult<Object> error = new ErrorDataResult<>(exception.getMessage(),"Exception.Error");

	        return error;
	    }
}
