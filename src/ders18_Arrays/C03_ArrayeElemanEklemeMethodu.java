package ders18_Arrays;

import java.util.Arrays;

public class C03_ArrayeElemanEklemeMethodu {

    public static void main(String[] args) {

        int[] ilkArr = {2,5,6,9};
        int eklenecekSayi = 8;

        int[] sonArr = arrayeElemanEkle(ilkArr,eklenecekSayi);

        System.out.println(Arrays.toString(sonArr));

    }
    public static int[] arrayeElemanEkle(int[] ilkArr, int eklenecekSayi){

        int[] yeniArr = new int[ilkArr.length+1];

        for (int i = 0; i < ilkArr.length ; i++) {
            yeniArr[i] = ilkArr[i];
        }
        yeniArr[yeniArr.length-1] = eklenecekSayi;
        return yeniArr;
    }
}
