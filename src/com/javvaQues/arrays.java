package com.javvaQues;


import java.util.Arrays;

public class arrays{

public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6,90};

    System.out.println(Arrays.toString(arr));
//    swap(arr, 2,3);
//
//    System.out.println(Arrays.toString(arr));
//
//    System.out.println(max(arr));
//    rev(arr);
//    System.out.println(Arrays.toString(arr));
    ls(3,arr);
}

public static void swap(int[] arr, int i1, int i2){
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] =temp;
}

public static int max(int arr[]){
//    Scanner sc = new Scanner(System.in);
//    int[] arr = new int[5];
//    for (int i = 0; i < arr.length; i++) {
//
//    }
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
    if (arr[i]>max){

        max  = arr[i];
    }

    }
    return max;
}
public static void rev(int[] arr){
    int start = 0;
    int end = arr.length -1;


    while (start < end){
        swap(arr, start, end);
        start++;
        end--;
    }
}

public static void ls(int a,int[] arr){
    for (int j : arr) {
        if (j == a) {
            System.out.println(j);
        }

    }
}

}


