/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
public interface Federable<Fed extends Federation<?>> {
	
	public Fed getFederation();
	public void setFederation(Fed federation);
}
