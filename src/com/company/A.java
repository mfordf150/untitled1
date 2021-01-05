package com.company;
//В  вагоне 9 купе по 4 места в каждом. Сколько мест в вагоне?
public class A {
    public static void main(String[] args) {
        int x = trainCompartment(9, 4);
        System.out.println(x + " мест в вагоне ");
    }

    public static int trainCompartment(int z, int y) {
      return z * y;
    }


}
