package com.gitupscale.jpa.common;

public interface Doc {
		
	public abstract DocType getDocType();
	
	public abstract String getUrl(); 
	
	public abstract String getName();
	
	public abstract String getBaseUrl();
	
	public abstract String getDescription();
	
}
