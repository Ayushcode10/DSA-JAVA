package com.OOPS.Generics;

import java.util.Arrays;

public class CustomGenericArray<T> {

    private Object[] data;
    private int DEFAULT_SIZE=5;
    private int size=0;

    public CustomGenericArray(){
        this.data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length*2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    public T remove(){
        return (T) data[--size];
    }

    public void set(int index, T value){
         data[index] = value;
    }

    public T get(int index){
        return (T)data[index];
    }

    @Override
    public String toString() {
        return "data=" + Arrays.toString(data);
    }
    
    public static void main(String[] args) {
        CustomGenericArray<String> list = new CustomGenericArray<String>();

        list.add("ayush");
        list.add("ayush");
        list.add("ayush");
        list.add("ayush");
        list.add("ayush");

        System.out.println(list);
    }

}
