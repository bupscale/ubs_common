/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class AuditSection implements Serializable {

	private static final long serialVersionUID = -1934446958975060889L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedOn;

	private String modifiedBy;

	public AuditSection() {

	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = (Date) createdOn.clone();
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = (Date) modifiedOn.clone();
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}