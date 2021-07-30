/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
public interface Auditable {

	public AuditSection getAuditSection();

	public void setAuditSection(AuditSection audit);
}