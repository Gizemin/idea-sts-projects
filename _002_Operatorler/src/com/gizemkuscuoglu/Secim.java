package com.gizemkuscuoglu;

public class Secim {

	public static void main(String[] args) {
		
		int secmenYasi= 1 , yasSiniri=18;
		
		System.out.println(secmenYasi >= yasSiniri);
		
		// Karar kontrol mekanizması
		
		if 	(secmenYasi >= yasSiniri) {
			System.out.println("EVET OY KULLANABİLİRSİNİZ.");
			
	
	} else {
		System.out.println("HAYIR OY KULLANAMAZSINIZ!");
		System.out.println(yasSiniri-secmenYasi + " yıl sonra kullanabilirsiniz.");
			
	}
	}

}
