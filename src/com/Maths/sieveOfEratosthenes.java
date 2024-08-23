package com.Maths;



public class sieveOfEratosthenes {
    /*
    this is a program to search for all the prime no.s in a given list of
    numbers in an optimised way
     */

    public static void main(String[] args) {
        int n = 20;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }

    public static void sieve(int n, boolean[] primes){
        //at the start all the elements in the bool[] arr are false
        /*and if an element is true then it means the element has already been marked
        as non-prime*/
        for (int i = 2; i <=n ; i++) {
            //check if element is false(which means IsPrime)
            if (!primes[i]){
                //remove all the multiples of ith element
                for (int j = i*2; j <=n ; j+=i) {
                    //switching the value to true(which means NotPrime)
                    primes[j] = true;
                }
            }
        }

        //simply printing the prime numbers
        for (int k = 2; k <=n; k++) {
            if (!primes[k]){
                System.out.print(k+ " ");
            }
        }

        }


    }

