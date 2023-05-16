package com.kuscuoglu;

public class MyTypeCasting {

	public static void main(String[] args) {
		
		int intYasi=127;
		
		double doubleYasi= intYasi; // 64 bit
		System.out.println(intYasi);
		System.out.println(doubleYasi);
		
		float floatYasi=intYasi;   // 32 bit
		System.out.println(intYasi);
		System.out.println(floatYasi);
		
		byte byteYasi=(byte) intYasi; // 8 bit
		System.out.println(intYasi);
		System.out.println(byteYasi);
		
		long longYasi= intYasi; // 64 bit
		System.out.println(intYasi);
		System.out.println(longYasi);
		
		System.out.println("--------------------------"); 
		
		int a=2_147_483_647;
		int b=1;
		int c=a+b;
		
		System.out.println(c);
		
		System.out.println("--------------------------"); 
		byte x=127;
		byte y=127;
		byte z= (byte) (x+y);
		System.out.println(z);
		
		System.out.println("--------------------------"); 
		short x1=32767;
		short y1=32767;
		int z1= (x1+y1); // 32 bit
		// short z2= (short)(x1+y1); // 32 bitt
		System.out.println(z1);
		
		System.out.println("--------------------------"); 
		
		int myIntVal =1; // 32 bit
		short myShortVal=1; // 16 bit
		System.out.println(myIntVal+myShortVal);
		
		System.out.println("--------------------------"); 
		
		int myByteVal1 =127; // 32 bit
		short myShortVal1=32767; // 16 bit
		int sonuc= myByteVal1+myShortVal1;
		System.out.println(sonuc);
		
		
	}

}
