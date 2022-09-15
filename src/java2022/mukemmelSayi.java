package java2022;

public class mukemmelSayi {
    
    public static void main(String[] args) {
        int sayi=8128;
        
        int sayac=0;
        
        for (int i = 1; i <sayi; i++) {
            if  ( sayi % i == 0) {
                sayac=sayac+i;
            }
            
        }if (sayi==sayac) {
                System.out.println("sayi mukemmel sayidir");
            }else    {
                System.out.println("sayi mukemmel sayi degildir");
            }
                
        
        
        
    }
    
}
