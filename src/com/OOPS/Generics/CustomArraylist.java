package com.OOPS.Generics;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private int DEFAULT_SIZE = 5;
    private int size = 0;

    public CustomArraylist( ){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    public void remove(){
        --size;
    }

    public int set(int index, int value){
        return data[index] = value;
    }

    public int get(int index){
        return data[index];
    }
    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        //copy the elements of previous array into the new bigger array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArraylist list = new CustomArraylist();

//        for (int i = 1; i < 6; i++) {
//             list.add(i);
//        }

//        list.set(4,10);

//        System.out.println(list);
        list.remove();
        System.out.println(list);
//        System.out.println(list.get(3));

    }
}
