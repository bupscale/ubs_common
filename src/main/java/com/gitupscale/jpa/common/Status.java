package com.gitupscale.jpa.common;

public enum Status {
	SUCCESS,
	FAILED,
	INPROGRESS,
	PENDING_PAYMENT,
	ROLLBACK,
	INITIATED,
	CANCELLED,
	ACTIVE,
	DELETED,
	ACCEPTED,
	SUSPENDED,
	RESUMED,
	BLACKLISTED,
	/**
	 * A completed and paid Bet for example
	 * */
	COMPLETED,
	NEW,
	DRAFT,
	
	/**
	 * The session Tirage has normally and gracefully been 
	 * closed after a successful draw.
	 * Tirage completed and result published and
	 * should be accessible to anyone who want to
	 * consult it
	 * */
	DRAWN_CLOSED,
	/**
	 * After a call to the betservice.computeWinningBets methog
	 * the tirage status is set to this to avoid
	 * recomputing it
	 * */
	COMPUTED_CLOSED,
	OPEN,
	FULLY_PAID,
	UNDER_PAYMENT_CLEARANCE,
	PARTIALLY_PAID,
	
	/**
	 * Status of a TIMSI
	 * */
	BUSY,
	AVAILABLE,
	
	NONE,
	UNKNOWN,
	UNDEFINED
	;
	
	public static Status translatedValueOf(String status) {
		
		switch(status) {
			case "200":{
				return SUCCESS;
			}
			case "OK": {
				return SUCCESS;
			}
			case "TS": {
				return SUCCESS;
			}
			default: return FAILED;
		}
	}
}
