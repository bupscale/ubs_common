/**
 * 
 */
package com.gitupscale.jpa.common;

import javax.persistence.Embeddable;

/**
 * @author noelson
 *
 */
@Embeddable
public class Adiresy {

	private String lot;
	
	private String rue;
	
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

}
