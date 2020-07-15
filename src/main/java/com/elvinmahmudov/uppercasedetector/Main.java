package com.elvinmahmudov.uppercasedetector;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        boolean allAreUppercase = UpperCaseDetector.check(Arrays.asList(args));
        if (allAreUppercase) {
            System.out.println("Yes! All input parameters are in upper case.");
        } else {
            System.out.println("No! Not all input parameters are in upper case.");
        }
    }
}
