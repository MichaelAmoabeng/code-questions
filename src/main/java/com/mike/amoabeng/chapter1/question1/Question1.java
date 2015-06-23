package com.mike.amoabeng.chapter1.question1;


public class Question1 {

    /*
    Implement an algorithm to determine if a string has all unique characters.
    What if you cannot use additional data structures?
    */

//**the below solution works if we are allowed to use additional data structures**
    public static boolean checkUnique(String str){
        boolean[] myArr = new boolean[256];

        for(int i = 0; i < str.length(); i++){
            //convert char at position i to it's ASCII value
            int ascii = (int) str.charAt(i);

            //if we haven't seen this character before
            if (!myArr[ascii]){
                myArr[ascii]=true;
            }
            else {
                //char has been seen before so return false
                return false;
            }

        }
        return true;
    }
}
