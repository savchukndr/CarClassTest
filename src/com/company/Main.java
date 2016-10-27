package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarCR ob1 = new CarCR(3);
        CarCL ob2;
        List<CarCL> ob2List = new ArrayList<CarCL>();
        for (int j = 0; j <= ob1.getCountOfCars(); j++) {
            for (String aMA : ob1.modelArray) {
                for (int aDA : ob1.doorArray) {
                    ob2 = ob1.carCompos(aDA, aMA);
                    ob2List.add(ob2);
                }
            }

        }

        System.out.println(ob2List);
        for(CarCL x: ob2List){
            System.out.println("amount of doors: " + x.getDoors() + " model name: " + x.getModelName() + "\n");
        }
    }
}
