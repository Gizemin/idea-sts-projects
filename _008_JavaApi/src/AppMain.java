import java.time.*;
import java.util.Arrays;


public class AppMain {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");


        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("---------------------");

        String str1 = "abc";
        System.out.println(str1.startsWith("t")); // false
        System.out.println(str1.endsWith("c")); // true
        System.out.println(str1.contains("b"));

        String personelAdi = " Mehmet Caner ";
        System.out.println(personelAdi);
        System.out.println(personelAdi.trim());

        var adi = "Ahmet Akkoyun";
        System.out.println(adi.toUpperCase());

        var yasi = 25;
        System.out.println(yasi);


        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());

        var piSayisi = 3.14345789887;
        System.out.format("%5.2f", piSayisi);
        System.out.println("------------------");

        var x = "Ali";
        var y = "Ali";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("------------------");

        String z = "Ali";
        System.out.println(x == z);
        System.out.println(x.equals(z));
        System.out.println("------------------");

        String n = new String("Ali");
        System.out.println(x == n); // içteki değere bakar adrese de bakar
        System.out.println(x.equals(n)); // içteki değere bakar.

        System.out.println("------------------");


        /* iş mülakatında kesin çıkar.
        - aşağıdaki ekran çıktılarını yazınız
         */


        System.out.println(" " + 1 + 2);
        System.out.println(1 + " " + 2 + 3);
        System.out.println(1 + 2 + " " + 8);

        System.out.println(" " + (1 + 2));
        System.out.println(1 + " " + 2 + 3);
        System.out.println(1 + 2 + " " + 8);

        System.out.println("-------------------------");

        String[] hayvanlar = {"Deve", "Maymun", "Aslan", "Kaplan"};
        System.out.println(hayvanlar.length);
        System.out.println(hayvanlar[0]);  // Deve
        hayvanlar[0] = "Kedi";
        System.out.println(hayvanlar[0]);   // Kedi

        System.out.println("-------------------------");
        for (int i = 0; i < hayvanlar.length; i++) {
            System.out.println(hayvanlar[i]);
        }


        System.out.println("-------------------------");
        Arrays.sort(hayvanlar);
        for (int i = 0; i < hayvanlar.length; i++) {
            System.out.println(hayvanlar[i]);

        }
        System.out.println("-------------------------");

        int [] myArr1;
        int[] myArr2;
        int []myArr3;
        int myArr4[];
        int myArr5 [];

        var simdi= Instant.now();
        System.out.println(simdi);

        var simdi2=Instant.now();
        System.out.println(simdi2);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(ZonedDateTime.now());


        var tarih1= LocalDate.of(2023, Month.MAY, 10);
        System.out.println(tarih1);

        var tarih2= LocalDate.of(2023, 5, 10);
         System.out.println(tarih2);

        System.out.println(tarih1.plusDays(32));
        System.out.println(tarih2.minusMonths(3).minusDays(10));







    }
}



