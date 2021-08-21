/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
public interface Contactable<Cont> {
	
	public Cont getContact();

	public void setContact(Cont contact);
}
