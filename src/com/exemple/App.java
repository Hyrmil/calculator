package com.exemple;

public class App {
    public static void main(String[] args) {
        // Initialisation variable
        String symbol;
        double result = 0.0;
        double number1;
        double number2;
        Requests req = new Requests();  
        

        // Main program
        System.out.println("Welcome to the calculator !");
        System.out.println("It sums, divide, multiply or add two numbers.");
        System.out.println("Type \"enter\" when your answer is complete");

        System.out.println("What do you want to do ?");
        System.out.println("Type the wanted symbol within the flollowing : /, *, -, +");
        symbol = req.setSymbol();

        System.out.println("What is your first number ?");
        number1 = req.setNumber();

        System.out.println("What is your second number ?");
        number2 = req.setNumber();
        if (symbol.equals("/") && number2 == 0) {
            System.out.println("Cannot divide by 0, enter new number");
            number2 = req.setNumber();
        } 

        switch (symbol) {
            case "/":
                result = number1 / number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "+":
                result = number1 + number2;
                break;

            default:
                break;
        }
        
        req.closeScanner();
        System.out.println("Your result is : " + number1 + " " + symbol + " " + number2 + " = " + result);
        
    }
}
