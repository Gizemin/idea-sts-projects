package com.gizemkuscuoglu;

public class AppMain {

    public static void main(String[] args) {

        // Hayvan hayvan=new Hayvan() ;
        //Soyut sınıftan asla nesne oluşturulamaz

        Kedi kedi = new Kedi();
        kedi.yemekYe();

        //Abstract sınıfı miras alabiliriz.

        kedi.sesVer();

        Kopek kopek = new Kopek();
        kopek.yemekYe();
        kopek.sesVer();

         /* Hayvan hayvan1 = new Kedi();
            hayvan1.sesVer();

        // Hayvan  hayvan2= new Kopek();
            hayvan2.sesVer();

*/
        Hayvan hayvan = new Kedi();
        hayvan.sesVer();

        //hayvan=new Kopek();
        //hayvan.sesVer();

        hayvan=new At();
        hayvan.sesVer();

        Hayvan ustNesne=new Hayvan() {
            @Override
            public void sesVer() {
                System.out.println("sesVer ustNesne ");

            }

            @Override
            public void hareketEt() {
                System.out.println("hareketRt ustNesne ");

            }

            @Override
            public void bilgisiniGoster() {
                System.out.println("bilgisiniGetir ustNesne");

            }
        };

        ustNesne.sesVer();
    }
}