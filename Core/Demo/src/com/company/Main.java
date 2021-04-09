package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String EMAIL_PATTERN =
                "^[a-zA-Z]{1}\\w{3,}";

        String email1 = "java123";
        String email2 = "ja12a";
        String email3 = "java";
        String email4 = "1java";
        String email5 = "1234";
        String email6 = "jav";
        String email7 = "123a";

        System.out.println(email1 + ": " + Pattern.matches(EMAIL_PATTERN, email1));
        System.out.println(email2 + ": " + Pattern.matches(EMAIL_PATTERN, email2));
        System.out.println(email3 + ": " + Pattern.matches(EMAIL_PATTERN, email3));
        System.out.println(email4 + ": " + Pattern.matches(EMAIL_PATTERN, email4));
        System.out.println(email5 + ": " + Pattern.matches(EMAIL_PATTERN, email5));
        System.out.println(email6 + ": " + Pattern.matches(EMAIL_PATTERN, email6));
        System.out.println(email7 + ": " + Pattern.matches(EMAIL_PATTERN, email7));
    }
}
