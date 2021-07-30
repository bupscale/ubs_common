/**
 * 
 */
package com.gitupscale.jpa.common;

import java.io.Serializable;
/**
 * @author Noelson
 *
 */
import java.util.Date;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;

@Embeddable
public class RfcSection<K extends BaseEntity<?, K>> implements Serializable {

	private static final long serialVersionUID = -7236854421998117563L;

	@OneToOne
	private K rfc;

	/**
	 * 0: Fully approved 1: 1 more approval left 2: 2 more approvals left etc ...
	 */
	@Enumerated(EnumType.STRING)
	private Status rfcStatus;

	/**
	 * The depth of the approval level that is required for this particular
	 * persistable entity.
	 */
	private int requiredApprovalLevelDepth = 1;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "rfc_approval", joinColumns = { @JoinColumn(name = "rfc_id", referencedColumnName = "id") })
	@MapKeyColumn(name = "level")
	@Column(name = "approvedOn",nullable = true)
	private Map<Integer, Date> approvalDates;
	
	public Status getRfcStatus() {
		return rfcStatus;
	}

	public void setRfcStatus(Status rfcStatus) {
		this.rfcStatus = rfcStatus;
	}

	public int getRequiredApprovalLevelDepth() {
		return requiredApprovalLevelDepth;
	}

	public void setRequiredApprovalLevelDepth(int requiredApprovalLevelDepth) {
		this.requiredApprovalLevelDepth = requiredApprovalLevelDepth;
	}

	public Map<Integer, Date> getApprovalDates() {
		return approvalDates;
	}

	public void setApprovalDates(Map<Integer, Date> approvalDates) {
		this.approvalDates = approvalDates;
	}

	public K getRfc() {
		return rfc;
	}

	public void setRfc(K rfc) {
		this.rfc = rfc;
	}
}