package com.wartree.krieghb.experiments;

public enum EStrings {
	
	ONE("Oy"),
	STAR_SEPERATOR("**************************************************");
	
	private final String value;
	
	private EStrings(String myString) {
		this.value = myString;
		
	}
	
	public String getValue() {
		return this.value;
	}

}
