package ders27_Immutable;

public class C01_StringPool {

    public static void main(String[] args) {

        String str1 = new String("Java");
        String str2 = "Ja";
        str2 = str2.concat("va");

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);

    }

}
