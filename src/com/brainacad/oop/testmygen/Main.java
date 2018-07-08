package com.brainacad.oop.testmygen;

import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    MyNumGenerator numGenerator = new MyNumGenerator(5,64);
    System.out.println(numGenerator.generate());
  }
}
