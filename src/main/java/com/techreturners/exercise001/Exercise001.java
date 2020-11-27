package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        double vat = Math.round(originalPrice * vatRate);
        return vat/100 + originalPrice;
    }

    public String reverse(String sentence) {
       StringBuilder sb = new StringBuilder(sentence);
       return sb.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getType().equalsIgnoreCase("Linux")){
                count++;
            }
        }
        return count;
    }
}
