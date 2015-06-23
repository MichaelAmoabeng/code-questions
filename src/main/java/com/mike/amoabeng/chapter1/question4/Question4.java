package com.mike.amoabeng.chapter1.question4;


public class Question4 {

    /*
    write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
    the end of the string to hold the additional characters. and that you are given the "true" length of the string.
    (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)

    EXAMPLE
    Input: "Mr John Smith     "
    Output: "Mr%20John%20Smith"

     */

    public void replaceSpaces(String str){
        char[] charArray = str.toCharArray();
        for (char i : charArray){
            if (Character.isWhitespace(i)){
                //charArray[i] = %20;
            }

        }
    }
}
