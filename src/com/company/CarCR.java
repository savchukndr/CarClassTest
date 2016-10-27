package com.company;

import java.util.List;

/**
 * Created by savch on 27.10.2016.
 */
public class CarCR {
    String modelArray[];
    int doorArray[];
    private int countOfCars;
    private List<CarCL> carObList;

    CarCR(int i) {
        this.countOfCars = i;
        this.modelArray = new String[]{"Ford", "Kia", "Mersedess", "BMW", "Fiat"};
        this.doorArray = new int[]{3, 5, 2};
    }

    int getCountOfCars(){
        return this.countOfCars;
    }

    private CarCL carObCreator(int i, String f){
        return new CarCL(i, f);
    }

    CarCL carCompos(int x, String y) {
        if (this.countOfCars <= 0) {
            return this.carObCreator(0, "No such model");
        } else {
            return this.carObCreator(x, y);
            /*for (int j = 0; j <= this.countOfCars; j++) {
                for (String aModelArray : this.modelArray) {
                    for (int aDoorArray : this.doorArray) {
                        this.carObList.add(carObCreator(aDoorArray, aModelArray));
                    }
                }
            }
            return this.carObList;*/
        }
    }

}
