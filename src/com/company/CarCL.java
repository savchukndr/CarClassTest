package com.company;

/**
 * Created by savch on 27.10.2016.
 */
class CarCL {
    private int doors;
    private String modelName;

    CarCL(int d, String m){
        this.doors = d;
        this.modelName = m;
    }

    int getDoors(){
        return this.doors;
    }

    String getModelName(){
        return this.modelName;
    }
}
