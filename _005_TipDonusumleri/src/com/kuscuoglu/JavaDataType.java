package com.kuscuoglu;

public class JavaDataType {  static // Scope 1

	
	int i=10;
	int b=1;
	int j=2;
	int k=3;
	
	public static void main(String[] args) { //Scope 2
		
		
		boolean bo=true;
		byte by=1;
		short sh=1;
		char ch='A';
		int in=1;
		long lo=1;
		float fl= 1.1f;
		double db=1.1;
		
		// System.out.println(bo);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(ch); //
		
		System.out.println(bo + " " + by + " " + sh + " " + ch);
		System.out.println(in + " " + lo + " " + fl + " " + db);
		
		String adi= "Mehmet Caner";
		String soyadi="Öksüz";
		System.out.println(adi + " " + soyadi);
		
		System.out.println(i); //10
		
		JavaDataType obj = new JavaDataType();
		obj.b=40;
		System.out.println(obj.b);
		
		obj.j=50;
		System.out.println(obj.j);
		
		obj.k=60;
		System.out.println(obj.k);

		JavaDataType obj2 = new JavaDataType();
		System.out.println(obj2.b);
	}

}
