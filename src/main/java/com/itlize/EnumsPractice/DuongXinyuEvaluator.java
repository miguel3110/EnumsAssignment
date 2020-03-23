package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator{
	
	private String name;
	
	DuongXinyuEvaluator (String name) {
		this.name = name;
	}
		
	boolean isDuong() {
		if ( this.name.equals("Duong")) return true;
		return false;
	}
	
	boolean isXinyu() {
		if ( this.name.equals("Xinyu")) return true;
		return false;
	}
}