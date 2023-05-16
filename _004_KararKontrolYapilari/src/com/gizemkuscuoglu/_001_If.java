package com.gizemkuscuoglu;

public class _001_If {

	public static void main(String[] args) {
		
		
		if ( 1>0 ) { 
			System.out.println("1. EVET DOĞRU");
			
		}
	/*
		if (1 > 25) {
			System.out.println("2. EVET DOĞRU");
	}
	*/
		
		int a=45;
		if(a>25) {
			System.out.println("3. EVET DOĞRU");
		}
		
		int x, y, z;
		x=10;
		y=15;
		z=25;
		
		//Parantes içi
		// Çarpma ya da bölge --- soldan sağa
		// Toplama ya da çarpma ---- soldan sağa
		
		if( (x+y) > (y-z) ) { 
			System.out.println("4. EVET DOĞRU");
		}
	}
}

