package ders1;

public class DizilerinTipleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println("v1.0-------------------------");
		//short myArray[]=null;
		short myArray[]= new short [4];
		
		myArray[0]=10;
		myArray[1]=20;
		myArray[2]=25;
		myArray[3]=10;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		System.out.println("v2.0-------------------------");
		
		short myArrayOther[]= {10,20,25,30};
		
		for (int i = 0; i < myArrayOther.length; i++) {
			System.out.println(myArrayOther[i]);
			
		}
		
	}

}
