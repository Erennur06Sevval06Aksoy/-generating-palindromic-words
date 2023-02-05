
package palindromik;

import java.util.Scanner;
public class Palindromik {

    
    public static void main(String[] args) {
        String kelime=null;
        Scanner x=new Scanner(System.in);
        System.out.println("Lütfen kelimenizi giriniz:  ");
        kelime=x.nextLine();
        int sayac=0;
        for (int i = 0; i < kelime.length()/2; i++) {
            if (kelime.charAt(i)!=kelime.charAt(kelime.length()-1-i)) {
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Girilen kelime palindromiktir...");
        }
        else{
            System.out.println("Maalesef kelimeniz palindromik değildir...");
        }
    }
}
