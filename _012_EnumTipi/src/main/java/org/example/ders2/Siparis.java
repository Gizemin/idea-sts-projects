package org.example.ders2;

public class Siparis {


    String pizzaBoyutu;
    float pizzaFiyati;


    enum Boyut {
        KUCUK,
        ORTA,
        BUYUK,
        ESKTRA_BUYUK
    }


    enum Fiyat {

        _100.0,
        _150.5,
        _200.1,

    }
    public Siparis() {
    }

    public Siparis(String pizzaBoyutu) {
        this.pizzaBoyutu = pizzaBoyutu;
    }


    public static void main(String[] args) {
        Siparis siparis = new Siparis();

        siparis.pizzaBoyutu = Boyut.ORTA.toString();
        System.out.println(siparis.pizzaBoyutu); //ORTA

        siparis.pizzaBoyutu = Boyut.BUYUK.toString();
        System.out.println(siparis.pizzaBoyutu); //BÜYÜK

        Siparis siparis2 = new Siparis("Büyük");
        System.out.println(siparis2.pizzaBoyutu);

        Siparis siparis3 = new Siparis(Boyut.BUYUK.toString());

        System.out.println(siparis3.pizzaBoyutu);


    }
}
