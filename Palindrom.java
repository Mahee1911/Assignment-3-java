//21CE029 : MAHEE GADHIYA
//PART : 3
//PRACTICAL : palindrome file
package com.info;

public class Palindrom {
    public static String palindromee(String s)
    {
        int length = s.length();   
        String reverse = new String();
        for ( int i = length - 1; i >= 0; i-- )  
            reverse = reverse + s.charAt(i);  
        if (s.equals(reverse))  
            return "Entered string is a palindrome.";  
        else  
            return "Entered string is not a palindrome.";   
    }
}

