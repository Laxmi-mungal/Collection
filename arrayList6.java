/* Write a Java program to remove the third element from a array list.   */



import java.util.*;
  public class arrayList6 {
  public static void main(String[] args) {

  
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");

  System.out.println(list);
 
  list.remove(2);

  System.out.println("After removing third element from the list:\n"+list);
 }
}
