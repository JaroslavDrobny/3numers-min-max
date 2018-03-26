
package tři.čísla;

import java.util.Scanner;


public class TřiČísla {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        int maximum= Integer.MIN_VALUE;
        int minimum= Integer.MAX_VALUE;
        System.out.println("Vlož číslo : ");
        int vstup = sc.nextInt();
        System.out.println("Vlož číslo : ");
        int vstup1 = sc.nextInt();
        System.out.println("Vlož číslo : ");
        int vstup2 = sc.nextInt();
        System.out.println("Output : ");
        System.out.println(vstup);
        System.out.println(vstup1);
        System.out.println(vstup2);
        if (vstup>maximum) {
                maximum = vstup;
            }
        if (vstup < minimum) {
                minimum = vstup;
        }
        if (vstup1>maximum) {
                maximum = vstup1;
            }
        if (vstup1 < minimum) {
                minimum = vstup1;
        }
        if (vstup2>maximum) {
                maximum = vstup2;
            }
        if (vstup2 < minimum) {
                minimum = vstup2;
        }
        System.out.println("maximum: " + maximum);
        System.out.println("minimum: " + minimum);
       
            
        
       
        
        
        
    }
    
}
