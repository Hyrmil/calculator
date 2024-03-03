package com.exemple;

import java.util.Scanner;

public class Requests {
    
    static final String NAN = "This is not a number, try again";
    static final String NO_SYMBOL = "This is not a valid symbol, try again";

    Boolean topDigit = false;
    Boolean topSymbol = false;
    Control ctrl = new Control();
    Scanner sc = new Scanner(System.in);

    public void closeScanner() {
       sc.close();
    }

    public String setSymbol() {
        String symbol = sc.nextLine();

        topSymbol = ctrl.isSymbol(symbol);

        while (Boolean.TRUE.equals(!topSymbol)) {
            System.out.println(NO_SYMBOL);
            symbol = sc.nextLine();
            topSymbol = ctrl.isSymbol(symbol);

            if (Boolean.TRUE.equals(topSymbol)) {
                break;
            }
        }

        return symbol;
    }

    public Double setNumber() {
        String numberToString = sc.nextLine();
        
        topDigit = ctrl.isDigit(numberToString);

        while (Boolean.TRUE.equals(!topDigit)) {
            System.out.println(NAN);
            numberToString = sc.nextLine();
            topDigit = ctrl.isDigit(numberToString);
            if (Boolean.TRUE.equals(topDigit)) {
                break;
            }
        }

        return Double.parseDouble(numberToString);
    }
}
