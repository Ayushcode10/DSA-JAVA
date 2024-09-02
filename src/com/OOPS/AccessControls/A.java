package com.OOPS.AccessControls;

public class A {

    protected int num;
//    private int n;
    String name;
    int[] arr;


    public int getN(){
        return num;
    }

    public void SetN(int n){
        this.num = n;
    }
    public A(int num, String s){
        this.num = num;
        this.name = s;
        this.arr = new int[num];
    }
}
