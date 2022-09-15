
package java2022;


public class asalMi {
    
    public static void main(String[] args) {
        int sayi=10;
        boolean asal=true;
        
        if(sayi<1){
            System.out.println("gecersiz sayi");
        }
        if (sayi==1) {
            System.out.println("asal değildir");
        }
        
        
        for (int i = 2; i <sayi/2; i++) {
            if(sayi % i == 0){
                asal=false;
        }
                }
        
        if (asal) {
              System.out.println("sayi asal ");
        }
        else {
          System.out.println("sayi asal değildir");
          
    }}
    
}
