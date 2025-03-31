package com.RecursionQuestions.Subsets;

import com.OOPS.AccessControls.A;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> list = subset(arr);
        for (List<Integer> l : list){
            System.out.println(l);
        }
    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>() ;

        outer.add(new ArrayList<>());

        for(int n : arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(n);
                outer.add(internal);
            }
        }
        return outer;
    }
}
