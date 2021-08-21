/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class StatusSection implements Serializable {

	private static final long serialVersionUID = -1934446958975060889L;

	@Column(columnDefinition = "boolean")
	private Boolean active = true;

	@Column(columnDefinition = "boolean")
	private Boolean enabled = true;

	/**
	 * This is only for soft deleted entity/record
	 */
	@Column(columnDefinition = "boolean")
	private Boolean deleted = false;

	@Column(columnDefinition = "boolean")
	private Boolean locked = false;

	@Column(columnDefinition = "boolean")
	private Boolean suspended = false;

	@Column(columnDefinition = "boolean")
	private Boolean blocked = false;

	/**
	 * The property 'terminated' is not accepted by mysql as it is used internally
	 * as a special keyword
	 */
	@Column(columnDefinition = "boolean", name = "ended")
	private Boolean terminated = false;

	@Column(columnDefinition = "boolean")
	private Boolean closed = false;
	
	@Enumerated(EnumType.STRING)
	private Status status;

	public StatusSection() {

	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public Boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}

	public Boolean isTerminated() {
		return terminated;
	}

	public void setTerminated(Boolean terminated) {
		this.terminated = terminated;
	}

	public Boolean isClosed() {
		return closed;
	}

	public void setClosed(Boolean closed) {
		this.closed = closed;
	}

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}