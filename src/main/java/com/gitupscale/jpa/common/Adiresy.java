/**
 * 
 */
package com.gitupscale.jpa.common;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * @author noelson
 *
 */
@Embeddable
public class Adiresy implements Serializable {

	private static final long serialVersionUID = -9012031141772035145L;

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
