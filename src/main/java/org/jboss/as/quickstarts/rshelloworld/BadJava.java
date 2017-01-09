package org.jboss.as.quickstarts.rshelloworld;
class BadJava {

  public static void imBad01(){
    String oneMillionHello = "";
      for (int i = 0; i < 100; i++) {
        oneMillionHello = oneMillionHello + "Hello!";
      }
    System.out.println(oneMillionHello.substring(0, 6));
  }

}
