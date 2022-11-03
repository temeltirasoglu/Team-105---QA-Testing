package ders18_Arrays;

import java.util.Arrays;

public class C01_EnBuyukEnKucukElementiBulma {

    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr = {2,6,8,10,45,21,3};

        enKucukEnBuyuk(arr);

    }
    public static void enKucukEnBuyuk(int[] arr){

        Arrays.sort(arr);

        System.out.println("En büyük element: "+ arr[arr.length-1]);
        System.out.println("En kücük element: "+ arr[0]);
    }

}
