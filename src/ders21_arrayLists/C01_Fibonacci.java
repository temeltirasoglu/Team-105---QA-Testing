package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Fibonacci {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi alip,
        // o tamsayidan kucuk Fibonacci sayilarini bir liste olarak yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();

        if(girilenSayi<0){
            System.out.println("Fibonacci serisi icin 0'dan büyük sayi girmelisin");
        } else if (girilenSayi==0) {
            System.out.println("0'dan kücük Fibonacci sayisi yoktur.");
        } else if (girilenSayi==1) {
            System.out.println("1den kücük tek Fibonacci sayisi: 0");
        } else {
            fibonacciSayilariniYazdir(girilenSayi);
        }

    }

    public static void fibonacciSayilariniYazdir(int girilenSayi){

        List<Integer> fibonacciListesi= new ArrayList<>();

        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(2);

        int yeniFibonacci = 0;
        int index=3;

        while (yeniFibonacci<girilenSayi){

            yeniFibonacci = fibonacciListesi.get(index-2)+fibonacciListesi.get(index-1);

            if (yeniFibonacci<girilenSayi){
                fibonacciListesi.add(yeniFibonacci);
            }
            index++;

        }
        System.out.println(fibonacciListesi);


    }


}
