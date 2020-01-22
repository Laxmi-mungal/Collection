/*   Write a Java program of swap two elements in an array list. */


import java.util.ArrayList;
import java.util.Collections;
  public class arrayList14 {
  public static void main(String[] args) {
   ArrayList<String> c1= new ArrayList<String>();
      
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          System.out.println("Array list before Swap:");
         
          System.out.println(c1);
      
          
         Collections.swap(c1, 0, 2);
          System.out.println("Array list after swap:");
          
          System.out.println(c1);
         
     }
}



