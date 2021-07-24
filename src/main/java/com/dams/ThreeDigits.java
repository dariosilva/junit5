package com.dams;

public class ThreeDigits {

    public static Object parse(String input) {
        StringBuilder sb = new StringBuilder();
        StringBuilder helper = new StringBuilder();
        var count = 0;
        
        for (var index = 0; index < input.length(); index++) {
            char c = input.charAt(index);
            var isDigit = Character.isDigit(c);
            if (isDigit) {
                helper.append(c);
                count++;
            } else {
                helper = new StringBuilder();
                count = 0;
            }

            if (count == 3) {
                count = 0;  
                sb.append(sb.length() == 0 ?
                    helper.toString() : (", " + helper.toString()));
            }
        }

        return sb.toString();
    }

}
