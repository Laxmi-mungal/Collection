//Write a Java program to test an array list is empty or not.


import java.util.ArrayList;
import java.util.Collections;
  public class arrayList18 {
  public static void main(String[] args) {
          ArrayList<String> c1= new ArrayList<String>();

          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
         
          System.out.println("Original array list: " + c1);
          System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
          c1.removeAll(c1);
          System.out.println("Array list after remove all elements "+c1);   
          System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
   }
}

