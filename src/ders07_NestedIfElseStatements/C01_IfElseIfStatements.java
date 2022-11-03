package ders07_NestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kg olarak kilonuzu giriniz");
        double agirlik = scan.nextDouble();
        System.out.println("Lütfen cm olarak boyunuzu giriniz");
        double boy = scan.nextDouble();

        double vke = (agirlik*10000/(boy*boy));
        System.out.println("Vücut kitle endeksiniz: " +vke);

        if(vke>30){
            System.out.println("Obez");
        } else if (vke>25) {
            System.out.println("Kilolu");
        } else if (vke>20) {
            System.out.println("Normal");
        } else if (vke<=20){
            System.out.println("Zayif");
        } else {
            System.out.println("Gecersiz deger");
        }


    }

}
