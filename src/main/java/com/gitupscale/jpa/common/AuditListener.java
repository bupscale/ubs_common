/**
 * 
 */
package com.gitupscale.jpa.common;

import java.util.Date;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 * @author Noelson
 *
 */
public class AuditListener {

	/**
	 * Executed before the entity manager persist operation is actually executed or
	 * cascaded. This call is synchronous with the persist operation.
	 * 
	 * @param  o  the object to persist
	 */
	@PrePersist
	public void onSave(Object o) {
		if (o instanceof Auditable) {
			Auditable audit = (Auditable) o;
			AuditSection auditSection = audit.getAuditSection();

			auditSection.setModifiedOn(new Date());
			if (auditSection.getCreatedOn() == null) {
				auditSection.setCreatedOn(new Date());
			}
			audit.setAuditSection(auditSection);
		}
	}

	/**
	 * Executed before the database UPDATE operation.
	 * 
	 * @param  o  the object to update
	 */
	@PreUpdate
	public void onUpdate(Object o) {
		if (o instanceof Auditable) {
			Auditable audit = (Auditable) o;
			AuditSection auditSection = audit.getAuditSection();

			auditSection.setModifiedOn(new Date());
			if (auditSection.getCreatedOn() == null) {
				auditSection.setCreatedOn(new Date());
			}
			audit.setAuditSection(auditSection);
		}
	}

	/**
	 * Executed before the entity manager remove operation is actually executed or
	 * cascaded. This call is synchronous with the remove operation.
	 * 
	 * @param o  the object to remove
	 */
	@PreRemove
	public void preRemove(Object o) {
		/*
		 * if (o instanceof Auditable) { Auditable audit = (Auditable) o; AuditSection
		 * auditSection = audit.getAuditSection();
		 * 
		 * auditSection.setModifiedOn(new Date()); if (auditSection.getCreatedOn() ==
		 * null) { auditSection.setCreatedOn(new Date()); }
		 * audit.setAuditSection(auditSection); }
		 */
	}

	/**
	 * Executed after the entity manager persist operation is actually executed or
	 * cascaded. This call is invoked after the database INSERT is executed.
	 * 
	 * @param o  the object to process post persist
	 */
	@PostPersist
	public void postPersist(Object o) {
		/*
		 * if (o instanceof Auditable) { Auditable audit = (Auditable) o; AuditSection
		 * auditSection = audit.getAuditSection();
		 * 
		 * auditSection.setModifiedOn(new Date()); if (auditSection.getCreatedOn() ==
		 * null) { auditSection.setCreatedOn(new Date()); }
		 * audit.setAuditSection(auditSection); }
		 */
	}

	/**
	 * Executed after the entity manager remove operation is actually executed or
	 * cascaded. This call is synchronous with the remove operation.
	 * 
	 * @param o  the object to remove post remove
	 */
	@PostRemove
	public void postRemove(Object o) {
		/*
		 * if (o instanceof Auditable) { Auditable audit = (Auditable) o; AuditSection
		 * auditSection = audit.getAuditSection();
		 * 
		 * auditSection.setModifiedOn(new Date()); if (auditSection.getCreatedOn() ==
		 * null) { auditSection.setCreatedOn(new Date()); }
		 * audit.setAuditSection(auditSection); }
		 */
	}

	/**
	 * Executed after the database UPDATE operation.
	 * 
	 * @param o  the object to update post processing
	 */
	@PostUpdate
	public void postUpdate(Object o) {
		/*
		 * if (o instanceof Auditable) { Auditable audit = (Auditable) o; AuditSection
		 * auditSection = audit.getAuditSection();
		 * 
		 * auditSection.setModifiedOn(new Date()); if (auditSection.getCreatedOn() ==
		 * null) { auditSection.setCreatedOn(new Date()); }
		 * audit.setAuditSection(auditSection); }
		 */
	}

	/**
	 * Executed after an entity has been loaded into the current persistence context
	 * or an entity has been refreshed.
	 * 
	 * @param o  the object to post load
	 */
	@PostLoad
	public void postLoad(Object o) {
		/*
		 * if (o instanceof Auditable) { Auditable audit = (Auditable) o; AuditSection
		 * auditSection = audit.getAuditSection();
		 * 
		 * auditSection.setModifiedOn(new Date()); if (auditSection.getCreatedOn() ==
		 * null) { auditSection.setCreatedOn(new Date()); }
		 * audit.setAuditSection(auditSection); }
		 */
	}
}