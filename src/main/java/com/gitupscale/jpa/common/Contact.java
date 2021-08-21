/**
 * 
 */
package com.gitupscale.jpa.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author noelson
 *
 */
@Embeddable
public class Contact implements Serializable {

	private static final long serialVersionUID = -4700445536764871889L;

	private long _msisdn;
			
	private String _email;
	
	private String _facebookId;
	
	private String _twitterId;
	
	private String _instagramId;
	
	@Column(nullable = true)
	private long _whatsapMsisdn;

	public long get_msisdn() {
		return _msisdn;
	}

	public void set_msisdn(long _msisdn) {
		this._msisdn = _msisdn;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_facebookId() {
		return _facebookId;
	}

	public void set_facebookId(String _facebookId) {
		this._facebookId = _facebookId;
	}

	public String get_twitterId() {
		return _twitterId;
	}

	public void set_twitterId(String _twitterId) {
		this._twitterId = _twitterId;
	}

	public String get_instagramId() {
		return _instagramId;
	}

	public void set_instagramId(String _instagramId) {
		this._instagramId = _instagramId;
	}

	public long get_whatsapMsisdn() {
		return _whatsapMsisdn;
	}

	public void set_whatsapMsisdn(long _whatsapMsisdn) {
		this._whatsapMsisdn = _whatsapMsisdn;
	}
	
}
