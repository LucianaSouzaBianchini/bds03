package com.devsuperior.bds03.controllers.exceptions;

import java.io.Serializable;
import java.time.Instant;

<<<<<<< HEAD
public class StandardError implements Serializable{

=======
public class StandardError implements Serializable {
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	private static final long serialVersionUID = 1L;

	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;
<<<<<<< HEAD

=======
	
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	public StandardError() {
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
<<<<<<< HEAD
	
=======
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
