/* Write a Java program to reverse elements in a array list.*/

import java.util.*;
  public class arrayList11 {

  public static void main(String[] args) {
  
  List<String> list= new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println("List before reversing :\n" + list);  
  Collections.reverse(list);
  System.out.println("List after reversing :\n" + list); 
 }
}
