package org.reservior.secure_ui.model.utility;

public class PerformUtility {
    public static int[] number_to_digit(int number, int []source){
        String temp = String.valueOf(number);
        int []digits = new int[temp.length()];

        String result = "";
        for(int i = 0; i < temp.length(); i++) {
            digits[i] = Character.digit(temp.charAt(i), 10);
            result = result+" "+digits[i];
        }

        System.out.println("View Hit: "+result);


        int k = digits.length-1;
        for(int i= 0; i<source.length; i++){
            if(k>=0){
                source[i] = digits[k];
                k--;
            }
        }

        return source;
    }
}
