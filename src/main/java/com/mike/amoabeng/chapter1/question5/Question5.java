package com.mike.amoabeng.chapter1.question5;



public class Question5 {

    /*
    Implement a method to perform basic string compression using the counts of repeated characters. For example,
    the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original
    string, your method should return the original string.
     */

    //The solution below works but isn't the most efficient
    public String strCompression(String str){
        String newString = "";
        int count = 1;
        char lastChar = str.charAt(0);


        for (int i = 1; i < str.length(); i++){
            if (str.charAt(i) == lastChar){
                count++;
            }
            else {
                newString =+ lastChar + "" + count;
                lastChar = str.charAt(i);
                count = 1;
            }
        }
        //return newString + lastChar + count;

        if (newString.length() < str.length()){
            return newString;
        }
        else {
            return str;
        }


    }

    public String strCompBetter(String s){
        StringBuffer newStr = new StringBuffer();
        int counter = 1;
        char last = s.charAt(0);

        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == last){
                counter++;
            }
            else {
                //newStr.append(last + counter);

                newStr.append(last);
                newStr.append(counter);

                last = s.charAt(i);
                counter = 1;
            }
        }
        //necessary in order to set the last repeated characters
        newStr.append(last);
        newStr.append(counter);
        return newStr.toString();
    }
}
