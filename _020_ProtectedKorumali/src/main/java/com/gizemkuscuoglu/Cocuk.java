package com.gizemkuscuoglu;

public class Cocuk extends Anne {

    protected void konustuguDil() {
        System.out.println("Türkçe");
    }

    public static class Anne {

        private int kimlikNo;

        protected int boyu;
        protected String gozRengi;
        protected String sacRengi;
                boolean saglikDurumu;


        public String adiSoyadi;

        protected void konustuguDil() {
            System.out.println("Rusça");
        }
    }
}
