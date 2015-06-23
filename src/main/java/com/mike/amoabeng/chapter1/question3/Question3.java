package com.mike.amoabeng.chapter1.question3;


public class Question3 {

    /*
        Given two strings, write a method to decide if one is a permutation of the other.
    */
        public boolean checkPermutation(String str1, String str2){
            if (str1 == null || str2 == null)
                return false;
            if (str1.length() != str2.length())
                return false;

            char[] x = str1.toCharArray();
            char[] y = str2.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);

            return Arrays.equals(x,y);
        }
}
