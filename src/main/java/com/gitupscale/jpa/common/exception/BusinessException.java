package com.gitupscale.jpa.common.exception;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true, value = { "cause", "suppressed", "stackTrace", "localizedMessage" })
public class BusinessException extends Exception {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	private static final long serialVersionUID = 1L;
	private String errorCode;
	private int httpStatus;
	private Map<String, Object> model;
	private String message;
	private String description;

	public BusinessException() {

	}

	public BusinessException(String errorCode, int httpStatus, String message, Map<String, Object> model) {
		super();
		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
		this.message = message;

		model.put("errorCode", errorCode);
		model.put("httpStatus", httpStatus);
		model.put("message", message);
		this.model = model;
	}

	public BusinessException(Map<String, Object> model) {
		super();
		try {
			this.errorCode = (String) model.get("errorCode");
			this.httpStatus = (Integer) model.get("httpStatus");
			this.message = (String) model.get("message");
			this.model = model;
		} catch (Exception e) {
			this.model = model;
			logger.warn(
					"Very likely the model passed to the BusinessException constructor misses important keys: errorCode | httpStatus | message.");
		}

	}

	public BusinessException(String errorCode, int httpStatus, String message) {
		super();
		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
		this.message = message;
		this.description = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Map<String, Object> getModel() {
		return model;
	}

	public void setModel(Map<String, Object> model) {
		this.model = model;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setStackTrace(StackTraceElement[] stackTrace) {
		StackTraceElement[] ste = {};
		super.setStackTrace(ste);
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		StackTraceElement[] ste = {};
		return ste;
	}

}