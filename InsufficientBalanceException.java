
package com.banking.project;

class InsufficientBalanceException extends RuntimeException
{
	private String message;

	public InsufficientBalanceException(String message)
	{
		this.message=message;
	}

	@Override
	public String getMessage() {
	return message;	
	}
}


/**  Rules for working with custom exception
 * 
 * -------------------------------------------
 * 1. create a class with the exception name.
 * 2. 
 *   a. to create a checked exception , inherit Exception class
 *   b. to create a unchecked exception , inherit RunTimeException class.
 * 3.Override getMessage() .(variable,contractor,method)
 * 4.Invoke Exception Object using throw keyword and handle it by using try and catch block.
 */

