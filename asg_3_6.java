//21CE029 : MAHEE GADHIYA
//PART : 3
//PRACTICAL : main palindrome file
package com.info;
import java.util.*;

public class asg_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrom p = new Palindrom();
        String s = new String();
        System.out.print("Enter the String to check Palindrome : ");
        s = sc.next();
        System.out.println(p.palindromee(s));

        System.out.println();
        System.out.println("Created By MAHEE GADHIYA : 21CE029");
    }
}

