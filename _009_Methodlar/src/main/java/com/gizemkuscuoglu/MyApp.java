package com.gizemkuscuoglu;

public class MyApp {

    public static void ekranaSelamYaz() {
        System.out.println("Selam");
    }

    public static void ekranaSelamYaz(String adi) {
        System.out.println("Selam " + adi);
    }

    public static void ekranaSelamYaz(String adi, String soyadi) {
        System.out.println("Selam " + adi + " " + soyadi);
    }

    public static void main(String[] args) {
        System.out.println("Selam");

        ekranaSelamYaz();
        ekranaSelamYaz("Ahmet");
        ekranaSelamYaz("Ahmet" , "Akkoyun");
    }


}
