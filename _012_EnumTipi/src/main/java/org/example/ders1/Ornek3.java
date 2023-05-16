package org.example.ders1;

public class Ornek3 {

    enum number {

        ONE,
        TWO,
        THREE
    }

    public static void main(String[] args) {
        number sayi= number.ONE;
        System.out.println(sayi);

        System.out.println(number.TWO + "" + number.THREE);
    }
}
