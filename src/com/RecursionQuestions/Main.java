package com.RecursionQuestions;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,6,7,8};
        System.out.println(Arrays.toString(s(arr)));
    }

    public static int[] sort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int m = arr.length/2;
        int[] l = sort(Arrays.copyOfRange(arr,0,m));
        int[] r = sort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(l,r);
    }

    private static int[] merge(int[] l, int[] r) {
        int[] mix = new int[l.length + r.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i<l.length && j<r.length){

            if(l[i]<r[j]){
                mix[k] = l[i];
                i++;
            }
            else{
                mix[k] = r[j];
                j++;
            }
            k++;

        }
        while (i<l.length){
            mix[k] = l[i];
            i++;
            k++;
        }
        while (j<r.length){
            mix[k] = r[j];
            j++;
            k++;
        }
        return mix;
    }

    public static int[] s(int [] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] l = s(Arrays.copyOfRange(arr, 0, mid));
        int[] r = s(Arrays.copyOfRange(arr, mid, arr.length));

        return m(l,r);
    }

    private static int[] m(int[] l, int[] r) {
        int[] mix = new int[l.length + r.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<l.length && j<r.length){
            if(l[i]<r[j]){
                mix[k] = l[i];
                i++;
            }
            else {
                mix[k] = r[j];
                j++;
            }
            k++;
        }
        while (i<l.length){
            mix[k] = l[i];
            i++;
            k++;
        }while (j<r.length){
            mix[k] = r[j];
            j++;
            k++;
        }
        return mix;
    }


}