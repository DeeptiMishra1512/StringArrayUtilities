package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
       String lastElement = array[array.length-1];

        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String lastElement = array[array.length-2];

        return lastElement;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for(int i =0; i<= array.length-1;i++){
            if(array[i] == value){
                result = true;
            }
          //  else result = false;
        }

        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int len = array.length;
        String[] reversedArray = new String[len];

        for (int i = 0; i < len; i++){
            reversedArray[i] = array[len - i - 1];
        }

        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        Boolean result = true;
        String str1 = " ";
        String str2 = " ";

        for(int i= array.length-1;i>=0;i--){
            str1 = str1 + array[i];
        }
        for(int i= 0;i<= array.length-1;i++){
           str2 = str2 + array[i];
        }

        if(str1.equalsIgnoreCase(str2)) {
            result = true;
            return result;
        }
        else {
            result = false;
            return result;
        }
    }






    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean result = true;
        String finalString ="";

        //To store values of input Array
        List<String> list = new ArrayList<>();
        String inputValue = "";

        //creating string from input array value
        for(int i=0; i< array.length;i++){
            inputValue = inputValue + array[i];
            System.out.println("input value string: " + inputValue);
        }
        //storing all the alphabets from input array into arraylist
        for(int i=0; i<inputValue.length();i++){
            if(inputValue.charAt(i) != ' ') {
                list.add(String.valueOf(inputValue.charAt(i)).toLowerCase());
            }
        }
        System.out.println("input value list: " + list);


        //Storing alphabets
        String alphaBet = "abcdefghijklmnopqrstuvwxyz";
        List<String> alphaValue = new ArrayList<>();
        //storing all the alphabets from string into arraylist
        for(int i=0;i<alphaBet.length();i++){
            alphaValue.add(String.valueOf(alphaBet.charAt(i)));
        }
        System.out.println("input value alphavalue: " + alphaValue);


    //for loop to check existence of alphanbet
            for (String alpha : alphaValue) {
                if (!list.contains(alpha)) {
                    return false;
            }
        }//end of string for loop

        return result;
    }






    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
       int count = 0;
       for(int i =0; i<= array.length-1;i++){
           if(array[i] == value){
               count++;
           }
       }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //created new list named result to store the result after deletion
        List<String> result = new ArrayList<>();

        for(int i =0; i< array.length;i++){
            if(array[i] != valueToRemove){
               String value = array[i] ;
                result.add(value);
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        // Converting Array(array) to arraylist(list)
        List<String> list = new ArrayList<>(Arrays.asList(array));
        //created new list named result
        List<String> result = new ArrayList<>();

        String prev = list.get(0);

        result.add(prev);

        for (int i = 1; i < list.size(); i++) {
            String current = list.get(i);
            if (!current.equals(prev)) {
                result.add(current);
                prev = current;
            }
        }
        return result.toArray(new String[0]);



    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
// Converting Array(array) to arraylist(list)
        List<String> list = new ArrayList<>(Arrays.asList(array));
        //created new list named resultPackedString
        List<String> resultPackedString = new ArrayList<>();

        String prev = list.get(0);

    //    resultPackedString.add(prev);
        String result = prev;
        for (int i = 1; i < list.size(); i++) {
            String current = list.get(i);

          //  prev = list.get(i);
            if (current.equals(prev)){
                result = result + current;
                System.out.println("result: " + result);
                prev = list.get(i);
                System.out.println("result: " + resultPackedString);
            }
            else {
                resultPackedString.add(result);
             //   resultPackedString.add(current);
                System.out.println("result: " + resultPackedString);
                result = current;
                prev = current;
                System.out.println("result: " + result);
                System.out.println("result: " + resultPackedString);
            }


        }
        resultPackedString.add(result);
        System.out.println("result: " + resultPackedString);
        return resultPackedString.toArray(new String[0]);
    }


}
