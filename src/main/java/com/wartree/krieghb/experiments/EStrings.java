package com.wartree.krieghb.experiments;

public enum EStrings {
	
	OY("Oy"),
	STAR_SEPERATOR("**************************************************");
	
	private final String stringVal;
	
	private EStrings(String myString) {
		this.stringVal = myString;
		
	}
	
	public String value() {
		return this.stringVal;
	}

}
