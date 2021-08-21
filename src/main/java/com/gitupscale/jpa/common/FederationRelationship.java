/**
 * 
 */
package com.gitupscale.jpa.common;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 * @author Noelson
 *
 */

@MappedSuperclass
public class FederationRelationship<Fed extends Federation<?>> extends BaseEntity<String, FederationRelationship<Fed>>{

	private static final long serialVersionUID = -4522803633472739872L;
	
	@ManyToOne
	private Fed aParty;
	
	@ManyToOne
	private Fed bParty;
		
	public Fed getParent() {
		return this.aParty.getWeight()<this.bParty.getWeight()?this.bParty:this.aParty;
	}
	
	public Fed getChild() {
		return this.aParty.getWeight()>this.bParty.getWeight()?this.bParty:this.aParty;
	}
	
	@Override
	public boolean equals(Object obj) {

		return (this.aParty.getName() == this.bParty.getName()) && (this.aParty.getWeight()==this.bParty.getWeight());
	}
}
