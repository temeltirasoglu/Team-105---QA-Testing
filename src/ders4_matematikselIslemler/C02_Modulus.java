package ders4_matematikselIslemler;

import java.util.Scanner;

public class C02_Modulus {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 basamakli bir sayi girin ve biz rakamlar toplamini verelim");

        int sayi = scan.nextInt();

        int sayi1 = sayi%10;
        sayi = sayi/10;

        int sayi2 = sayi%10;
        sayi = sayi/10;

        int sayi3 = sayi%10;
        sayi = sayi/10;

        int sayi4 = sayi%10;
        sayi = sayi/10;

        System.out.println(sayi1+sayi2+sayi3+sayi4);

    }
}
