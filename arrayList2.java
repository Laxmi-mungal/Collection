
/*  Write a Java program to iterate through all elements in a array list */


import java.util.*;
  public class arrayList2 {
  public static void main(String[] args) {
 
  List<String> list = new ArrayList<String>();
 
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");

  for (String element : list) {
    System.out.println(element);
    }
 }
}
