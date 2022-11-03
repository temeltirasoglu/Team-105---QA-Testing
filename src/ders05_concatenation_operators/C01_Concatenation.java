package ders05_concatenation_operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Güzeldir";
        String s3 = " ";

        int sayi1 = 4;
        int sayi2 = 3;


        //Java Güzeldir7
        System.out.println(s1+s3+s2+(sayi2+sayi1));

        //Java Güzeldir 12
        System.out.println(s1+s3+s2+s3+sayi1);


    }

}
