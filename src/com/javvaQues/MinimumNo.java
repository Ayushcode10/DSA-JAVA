package com.javvaQues;

public class MinimumNo {
    public static void main(String[] args) {
        int[] arr = {3,54,312,323,543,-5,32,432,};

        min(arr);
    }

    static int min(int[] arr){
        int min = arr[0];
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
                System.out.println("min value is: "+arr[i]);
            }
        }
        return -1;
    }
}
