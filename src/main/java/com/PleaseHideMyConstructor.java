package com;

public class PleaseHideMyConstructor {

  public static void stringsAreImmutable(){
    // Excessive garbage allocation, String are immutable
    String oneMillionHello = "";
      for (int i = 0; i < 100; i++) {
        oneMillionHello = oneMillionHello + "Hello!";
      }
    System.out.println(oneMillionHello.substring(0, 6));
  }

  public static void whyNotUsingGenerics(){
    // Using Raw Type Instead of Generics
    List listOfNumbers = new ArrayList();
    listOfNumbers.add(10);
    listOfNumbers.add("Twenty");
    //listOfNumbers.forEach(n -> System.out.println((int) n * 2)); 
    System.out.println(((int)listOfNumbers.get(0)) * 2);
    System.out.println(((int)listOfNumbers.get(1)) * 2);
  }
  
  
  public static void WhyIgnoringExceptions(){
    String nullString;
    int dontIgnoreMe = 2;
    try {
      if(dontIgnoreMe==2)
         System.out.println(nullString);
      else 
        System.out.println(nullString.substring(0, 6));
    } catch (NullPointerException e) {
      // Maybe, invisible man. Who cares, anyway?
    }  
   }
  
}
