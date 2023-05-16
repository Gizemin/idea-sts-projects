package com.gizemkuscuoglu.tekrar;

public class _02_Operatorler {

    public static void main(String[] args) {


        /* sınavda + operatörü çıkar ++ operatörü birer birer ekle demektir.
        sonuc=sonuc+s1 ile sonuc+=s1 aynı ifadedir.


          */

        String kullanıcı = "Mehmet";
        String parola= "123";

        boolean onay = (kullanıcı == "Mehmet");
        System.out.println(onay);

        boolean onay2= (kullanıcı == "Mehmet") && (parola == "123");
        System.out.println(onay2);
    }
}
