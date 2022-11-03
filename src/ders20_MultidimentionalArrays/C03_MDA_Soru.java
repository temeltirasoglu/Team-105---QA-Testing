package ders20_MultidimentionalArrays;

import java.util.Arrays;

public class C03_MDA_Soru {
    public static void main(String[] args) {

        // Verilen 2 Katli bir Array'de her bir ic arraydeki elementleri toplayip,
        // yeni olusturacaginiz tek katli arraya bu toplamlari atayin.


        int[][] arr = {{3,1,4,3},{1,2},{3,6,7},{10},{5,7}};

        int[] arr2 = new int[arr.length];

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            toplam+=arr[i][j];
            }
            arr2[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(arr2));

    }
}
