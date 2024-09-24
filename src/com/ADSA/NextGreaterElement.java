////package com.ADSA;
////
////import java.util.ArrayList;
////import java.util.Arrays;
////
////public class NextGreaterElement {
////    int[] arr;
////    ArrayList<Integer> a = new ArrayList<Integer>();
////    public int[] check(int[] arr){
////        for (int i = 0; i < arr.length; i++) {
////            for (int j = i+1; j <arr.length ; j++) {
////                if (arr[j]<arr[j-1]){
////                    a.add(j);
////                }
////            }
//        }
////        return arr;
////
////    public static void main(String[] args) {
////        NextGreaterElement a = new NextGreaterElement();
////        int[] arr = {1,3,5,1,2,3,4,1,2};
////        int[] nge = a.check(arr);
////        System.out.println(Arrays.toString(nge));
////    }
////}
