package ders4_matematikselIslemler;

import java.util.Scanner;

public class C03_DataCasting {

    public static void main(String[] args) {

    //kullanicidan 2 int deger alip birbirine bol ve sonucu double yazdir

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 2 Sayi Girin:");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println((double)(sayi1/sayi2));


    }

}
