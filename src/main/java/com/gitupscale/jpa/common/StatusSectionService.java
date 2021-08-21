/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
public interface StatusSectionService {
	public static StatusSection getDefaultActiveStatus() {
		StatusSection status = new StatusSection();
		status.setActive(true);
		status.setBlocked(false);
		status.setClosed(false);
		status.setDeleted(false);
		status.setEnabled(true);
		status.setLocked(false);
		status.setStatus(Status.ACTIVE);
		status.setSuspended(false);
		status.setTerminated(false);
		return status;
	}
	
	public static StatusSection getDefaultDeactiveStatus() {
		StatusSection status = new StatusSection();
		status.setActive(false);
		status.setBlocked(true);
		status.setClosed(true);
		status.setDeleted(true);
		status.setEnabled(false);
		status.setLocked(true);
		status.setStatus(Status.SUSPENDED);
		status.setSuspended(true);
		status.setTerminated(true);
		return status;
	}
}
