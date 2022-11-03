package ders20_MultidimentionalArrays;

public class C02_MDA_SayilarinCarpimi {
    public static void main(String[] args) {

        // Verilen 2 Katli bir arrayde bulunan tüm ssayilarin carpimini bize dondüren bir method olusturun.

        int[][] arr = {{5,7},{5,8,9},{4,7}};

        System.out.println(elementleriCarp(arr));
    }

        public static int elementleriCarp(int[][] arr){

            int carpim = 1;

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[i].length; j++) {
                    carpim*=arr[i][j];
                }

            }
            return carpim;
        }



}
