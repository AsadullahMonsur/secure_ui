package org.reservior.secure_ui.model.utility;

public class PerformUtility {
    public static int[] number_to_digit(int number, int []digits){
        String temp = String.valueOf(number);

        for(int i = 0; i < temp.length(); i++) {
            digits[i] = Character.digit(temp.charAt(i), 10);
        }

        return digits;
    }
}
