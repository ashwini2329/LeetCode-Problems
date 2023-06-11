import java.util.ArrayList;

/**
 ***********************************************************************
                     1108. Defanging an IP Address
 ***********************************************************************

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:

The given address is a valid IPv4 address.
 */

public class defangingIPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";    // Sample Input
        int strLength = address.length();
        String result = "";

        for(int i=0; i<strLength; i++) {
            if(address.charAt(i) == '.') {
                result += ("[.]");
            } else {
                result += (address.charAt(i));
            }
        }

        System.out.println("result = " + result);   // return result;
    }
}
