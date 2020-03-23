package com.itlize.EnumsPractice;

interface Duong{
	public String name();
}

interface Xinyu{
	public String name();
}

enum DuongXinyuEnum implements Duong, Xinyu{
	
	Duong, Xinyu;
	
	
	String getCatchPhrase() {
		return "Hey, my name is " + this.name() + "!";
	}
	
	boolean isDuong() {
		if ( this.name().equals("Duong")) return true;
		return false;
	}
	
	boolean isXinyu() {
		if ( this.name().equals("Xinyu")) return true;
		return false;
	}
}



