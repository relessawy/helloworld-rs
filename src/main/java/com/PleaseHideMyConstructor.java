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
  
  public static void WhyIgnoringExceptions(){
    String nullString=null;
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
