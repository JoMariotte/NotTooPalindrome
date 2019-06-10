package com.kaz.jo;

public class Main {

    public static void main(String[] args) {
        String[] tests = new String[6];
        tests[0] = "laval"; //true
        tests[1] = "Laval"; //true
        tests[2] = "azertyuiop"; //false
        tests[3] = "nossnn"; //true
        tests[4] = "nosson"; //true
        tests[5] = "npssnp"; //false
        for(int i=0;i<tests.length;i++) {
            System.out.println("\nTest" + i + " : " + testPal(tests[i]));
        }
    }

    public static boolean testPal(String stringToTest) {
        boolean notTooPalButStill = false;
        int errCount = 0;
        int start = 0;
        int end = stringToTest.length() - 1;
        while(start < end) {
            if(stringToTest.charAt(start) != stringToTest.charAt(end)){
                errCount++;
            }
            start++;
            end--;
        }
        if(errCount <= 1)
            notTooPalButStill = true;
        return notTooPalButStill;
    }
}
