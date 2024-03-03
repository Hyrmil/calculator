package com.exemple;

import java.util.Scanner;

public class Requests {
    
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
            System.out.println( "\"" + symbol + "\" is not a valid symbol, try again");
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
            System.out.println("\"" + numberToString + "\" is not a number, try again");
            numberToString = sc.nextLine();
            topDigit = ctrl.isDigit(numberToString);
            if (Boolean.TRUE.equals(topDigit)) {
                break;
            }
        }

        return Double.parseDouble(numberToString);
    }
}
