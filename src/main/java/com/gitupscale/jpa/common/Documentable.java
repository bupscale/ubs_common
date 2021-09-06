package com.gitupscale.jpa.common;

public interface Documentable<D extends Doc> {
	
	public DocumentSection<D> getDocumentSection();
	
	public void setDocumentSection(DocumentSection<D> documentSection);
}
