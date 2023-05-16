package ders1;

import java.util.Scanner;

public class CalismaZamaniDiziBoyutu {

	public static void main(String[] args) {
		
	Scanner read = new Scanner(System.in);
	
	int size, sum=0;
	
	System.out.print("Lütfen dizinin boyutunu belirleyiniz : ");
	size=read.nextInt();
	
	short myArray[]=new short[size];
	
	System.out.println("Dizinin boyutu " + size + " olarak girildi." );
	
	System.out.println("-------------------------");
	
	for (int i = 0; i < myArray.length; i++) {
		myArray[i]=read.nextShort();
		
	}
	
	System.out.println("-------------------------");
	
	for (int i = 0;    i < myArray.length;     i++) {
		sum=sum+myArray[i];
		System.out.println(myArray[i]);
		
	}
	
	//( myArray[i]==item)
	
	for(short item : myArray) {
		sum=sum+item;
	}
			
			System.out.println("Toplam: "  + sum );
	

	}

}
