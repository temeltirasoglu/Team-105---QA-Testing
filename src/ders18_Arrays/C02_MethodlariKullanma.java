package ders18_Arrays;

import java.util.Arrays;

public class C02_MethodlariKullanma {

    public static void main(String[] args) {

        // verilen bir int array'in elementlerini 3 artirin

    int[] arr = {2,4,6};

    arr = UcArtirma(arr);

    System.out.println(Arrays.toString(arr));

    }
    public static int[] UcArtirma(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=3;
        }
        return arr;
    }
}
