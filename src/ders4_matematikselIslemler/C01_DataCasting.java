package ders4_matematikselIslemler;

import java.util.Scanner;

public class C01_DataCasting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi girin:");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();


        int bolmeSonucu = (int)(sayi1/sayi2) ;

        System.out.println(bolmeSonucu);






    }


}
