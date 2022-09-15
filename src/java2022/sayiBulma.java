
package java2022;


public class sayiBulma {
    
    
    
    public static void main(String[] args) {
        int[] sayilar={1,2,3,5,7};
    int arananSayi=7;
    
    boolean bulunduMu=false;
    
        for (int i = 0; i <sayilar.length; i++) {
            if (sayilar[i]==arananSayi) {
                bulunduMu=true;
            }
                 }
    
        if (bulunduMu) {
            System.out.println("sayi bulundu");
        }else
            System.out.println("sayi bulunamadi");
        
    
    }
    
}
