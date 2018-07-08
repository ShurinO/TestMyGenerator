package com.brainacad.oop.testmygen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {
  private int numOfElm;
  private int maxNumb;

  public MyNumGenerator(int numOfElm, int maxNumb) {
    this.numOfElm = numOfElm;
    this.maxNumb = maxNumb;
  }

  public List<Integer> generate(){
    List<Integer> list = new ArrayList<>(numOfElm);
    Random random = new Random();
    for (int i = 0; i < numOfElm; i++) {
      list.add(random.nextInt(maxNumb+1));
    }
    return list;
  }
}
