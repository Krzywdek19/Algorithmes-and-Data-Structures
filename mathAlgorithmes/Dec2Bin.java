package org.example.mathAlgorithmes;

import java.util.ArrayList;
import java.util.List;

public class Dec2Bin {
    public static void main(String[] args) {
        int decValue = 56;
        String binaryValue = dec2Bin(decValue);
        System.out.println(decValue + " in binary is: " + binaryValue);
        System.out.println(binaryValue + " in dec is: " + decValue);
    }


    public static String dec2Bin(int decValue){
        StringBuilder result = new StringBuilder();
        while (decValue > 0){
            result.append(decValue%2);
            decValue /= 2;
        }
        return result.reverse().toString();
    }

    public static int bin2dec(String binaryValue){
        int result = 0;
        for(int i = 0; i < binaryValue.length(); i++){
            result += (int)Math.pow(Integer.parseInt(binaryValue.charAt(i)+""), i);
        }
        return result;
    }
}
