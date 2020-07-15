package com.elvinmahmudov.uppercasedetector;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCaseDetector {

    private static final String DEFAULT_REGEX = "^[A-Z].*";

    public static boolean check(List<String> input) {
        Matcher matcher = Pattern.compile(DEFAULT_REGEX).matcher("");

        for (String item : input) {
            if (!matcher.reset(item).matches()) return false;
        }

        return true;
    }
}
