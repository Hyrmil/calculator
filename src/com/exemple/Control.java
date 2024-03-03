package com.exemple;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Control {

    public Boolean isDigit(String input) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public Boolean isSymbol(String input) {
        Pattern pattern = Pattern.compile("[/*-+]");
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}

