package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[CAP]*\\d{4}[GHIKLM]";

    public ClassNameExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
