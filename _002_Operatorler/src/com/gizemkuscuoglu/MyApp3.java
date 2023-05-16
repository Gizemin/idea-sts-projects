package com.gizemkuscuoglu;

public class MyApp3 {
	
	static int sayi;
	
	public MyApp3() {
		sayi = 25;
		System.out.println("HAZIRLAYICI:" + sayi);
	}
	
	public static void main(String[] args) { //scope
		int sayi=0;
		System.out.println("main metodu: " + sayi);
	}

}
