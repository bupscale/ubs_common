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
	UNDEFINED,
	/**
	 * The colis/parcel is being packed by the ops team
	 * at the warehouse
	 * */
	PACKING,
	/**
	 * The parcel has been successfully packed, ready for pick-up
	 * */
	PACKAGED,
	/**
	 * The parcel left the warehouse to the transist: Taxi-brousse, colis-express, etc ...
	 * */
	DEPARTED,
	/**
	 * The parcel is on the way to destination with the transit company
	 * */
	IN_TRANSIST,
	/**
	 * The parcel arrived at the destination and is under clearance
	 * waiting for the client to pick it from the transit
	 * */
	IN_CLEARANCE,
	/**
	 * The parcel reached the destination and has been delivered to the client
	 * */
	DELIVERED
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
