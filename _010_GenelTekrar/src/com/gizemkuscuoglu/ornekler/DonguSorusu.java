package com.gizemkuscuoglu.ornekler;

public class DonguSorusu {




    public static <number2> int topla(int number1, number2){

        int number2 = 0;
        return number1+number2;
    }


    public static int carpma(int number1){
        int number1=5;
        return number1*10;
    }


    public static int bolme(int number1){
        int number2=5;
        int sonuc=number1/number2;
    }

    public static void yazdır(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {

        System.out.println(yazdır());
        int toplam=topla(5);
        System.out.println(toplam);
        
        }
    }
}
