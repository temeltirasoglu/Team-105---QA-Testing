package ders10_stringManipulations;

public class C01_SoruContainsIndexOf {

    public static void main(String[] args) {
        
        String cumle = "Java ile kodlama guzel. Ama bazen nasilkarisik olabiliyor. Bakalim nasil cozucez.";
        String mtn = "nasil";
        
        
        if(!cumle.contains(mtn)){

            System.out.println("Cümle metni icermiyor");
            
        } else {
            int ilkIndex = cumle.indexOf(mtn);
            int ikinciIndex = cumle.indexOf(mtn, ilkIndex+1);

            if (ikinciIndex==(-1)){
                System.out.println("Cümle metni bir kere iceriyor");
            } else {
                System.out.println("Cümle metni birden fazla iceriyor");
            }

        }


    }
    
}
