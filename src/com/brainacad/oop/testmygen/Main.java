package com.brainacad.oop.testmygen;


public class Main {
  public static void main(String[] args) {
    MyNumGenerator numGenerator = new MyNumGenerator(25,64);
    System.out.println(numGenerator.generate());
    System.out.println(numGenerator.generateDistinct());
  }
}
