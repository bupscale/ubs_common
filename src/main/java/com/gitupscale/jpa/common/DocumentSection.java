/**
 * 
 */
package com.gitupscale.jpa.common;

/**
 * @author Noelson
 *
 */
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.OneToMany;

@Embeddable
public class DocumentSection<D extends Doc> implements Serializable {

	private static final long serialVersionUID = -1934446958975060889L;

	@OneToMany
	private Set<D> documents;

	public Set<D> getDocuments() {
		return documents;
	}

	public void setDocuments(Set<D> documents) {
		this.documents = documents;
	}

}