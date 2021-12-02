package com.devsuperior.bds03.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class ValidationError extends StandardError{

	private static final long serialVersionUID = 1L;
	
=======
public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	private List<FieldMessage> errors = new ArrayList<>();

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldName, String message) {
<<<<<<< HEAD
		errors.add(new FieldMessage(fieldName,message));
	}
}
=======
		errors.add(new FieldMessage(fieldName, message));
	}
}
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
