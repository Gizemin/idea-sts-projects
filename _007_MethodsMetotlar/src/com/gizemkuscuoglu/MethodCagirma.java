package com.gizemkuscuoglu;

public class MethodCagirma {
/*
 * 
 
	
	void selamVer(String adi) {
		System.out.println("SELAM VER METODU. Sayın " + adi + " merhaba");
	}
	*/
	
	String selamVer(String adi) {
		return System.out.println("Sayın " + adi + " merhaba hoşgeldiniz.");
	
	
	void selamAl() {
		System.out.println("SELAM AL METODU");
		}
	
	public static void main(String[] args) {
		
		MethodCagirma obj= new MethodCagirma();
		obj.selamAl();
		obj.selamVer("Ali");
		obj.selamVer("Aminenur");
		obj.selamVer("Orhun");
		
	
	}

	
	
	
}
