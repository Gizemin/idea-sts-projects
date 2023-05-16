package com.gizemkuscuoglu;

public class _004_Switch {

	public static void main(String[] args) {

		// SINAVLAR A B C D E

		char harf = 'A';

		switch (harf) {

		case 'A': // durum

			System.out.println("Seçilen : " + harf);
			break;

		case 'B':

			System.out.println("Seçilen : " + harf);
			break;

		case 'C':

			System.out.println("Seçilen : " + harf);
			break;

		case 'D':

			System.out.println("Seçilen : " + harf);
			break;
		case 'E':

			System.out.println("Seçilen : " + harf);
			break;

		default:
			System.out.println("Seçiminiz " + harf + "uygun değil. ");

		}

		System.out.println("----------");

		int haftaninGunu = 3;

		if (haftaninGunu == 1) {
			System.out.println("Pazartesi");
		} else if (haftaninGunu == 2) {
			System.out.println("Salı");
		} else if (haftaninGunu == 3) {
			System.out.println("Çarşamba");
		} else if (haftaninGunu == 4) {
			System.out.println("Perşembe");
		} else if (haftaninGunu == 5) {
			System.out.println("Cuma");
		} else if (haftaninGunu == 6) {
			System.out.println("Cumartesi");
		} else if (haftaninGunu == 7) {
			System.out.println("Pazar");
		} else {

			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
		}

		switch (haftaninGunu) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;

		default: 
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
			break;
		}
	}

}
