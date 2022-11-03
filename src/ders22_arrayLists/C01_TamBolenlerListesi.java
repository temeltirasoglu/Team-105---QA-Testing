package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_TamBolenlerListesi {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan pozitif bir tamsayi alip
        //        o tamsayiyi tam bölebilen tüm pozitif tamsayilari
        //        bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölenlerini görmek istediginiz sayiyi giriniz.");
        int sayi = scan.nextInt();

        System.out.println(tamBolenlerListesi(sayi));


    }

    public static List<Integer> tamBolenlerListesi(int sayi){

        List<Integer> tambolenler = new ArrayList<>();

        for (int i = 1; i < sayi; i++) {

            if (sayi%i==0){

                tambolenler.add(i);

            }

        }
       return tambolenler;
    }

}
