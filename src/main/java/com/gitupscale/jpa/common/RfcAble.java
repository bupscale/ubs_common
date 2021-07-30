/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
public interface RfcAble<K extends BaseEntity<?, K>> {

	public RfcSection<K> getRfc();

	public void setRfc(RfcSection<K> rfc);
}