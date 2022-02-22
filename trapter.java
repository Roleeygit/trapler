import java.util.Scanner;

/*
* File: trapter.java
* Author: Juhász Roland
* Copyright: 2022, Juhász Roland
* Group: Szoft I N 
* Date: 2022-02-22
* Github: https://github.com/Roleeygit/
* Licenc: GNU GPL
*/

class trapter {
public static void main(String[] args) {
   System.out.println(" Trapéz területe\n Juhász Roland \n 2022-02-22 Szoft I N");

   try (Scanner scan = new Scanner(System.in)) {
    System.out.print("aoldal:"); 
       int aoldal = scan.nextInt();  
    
       System.out.print("boldal:"); 
       int boldal = scan.nextInt();
    
       System.out.print("coldal:"); 
       int coldal = scan.nextInt();
    
       System.out.print("doldal:"); 
       int doldal = scan.nextInt();
    
       double terület = ((aoldal) + boldal) / 4* (aoldal - coldal)
       * Math.sqrt((aoldal+boldal-coldal+doldal)*(aoldal-boldal-coldal+doldal)*
       (aoldal+boldal-coldal-doldal)*(-aoldal+boldal+coldal+doldal));
       System.out.println("A trapéz területe:" + terület);
       
}
}
}


