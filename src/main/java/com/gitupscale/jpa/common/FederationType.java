package com.gitupscale.jpa.common;


/**
 * @author Noelson
 *
 */
public enum FederationType {
	FARIPOKONTANY("FARITRA","SOUS-QUARTIER","SUB-QUARTER"),
	FOKONTANY("FOKONTANY","QUARTIER","QUARTER"),
	COMMUNE("BORIBORINTANY","COMMUNE","COMMUNITY"),
	DISTRICT("DISTRIKA","DISTRICT","DISTRICT"),
	REGION("FARITANY","REGION","REGION"),
	PAYS("FIRENENA","PAYS","COUNTRY");
	
	FederationType(String fr,String mg,String en){
		this.fr = fr;
		this.mg=mg;
		this.en=en;
	}

	private String fr;
	
	private String mg;
	
	private String en;

	public String getFr() {
		return fr;
	}

	public void setFr(String fr) {
		this.fr = fr;
	}

	public String getMg() {
		return mg;
	}

	public void setMg(String mg) {
		this.mg = mg;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}
	
}
