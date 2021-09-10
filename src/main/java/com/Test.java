package com;

import com.exceptions.CustomInputException;
import com.utils.CalculatorUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        int choice = 0;
        int first = 0;
        int second = 0;
        int result = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your operation: \n 1. Summarizing \n 2. Dividing \n 3. Multiplication" +
                "\n 4. Subsctraction");
        choice = Integer.parseInt(bufferedReader.readLine());
        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            throw new CustomInputException("Make a right choice, please!");
        }
        System.out.println("Enter your first parameter: ");
        try {
            first = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            throw new CustomInputException("You must enter decimals only");
        }

        System.out.println("Enter your second parameter: ");
        try {
            second = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e) {
            throw new CustomInputException("You must enter decimals only");
        }

        switch (choice) {
            case (1):
                result = CalculatorUtils.summarize(first, second);
                break;
            case (2):
                result = CalculatorUtils.dividing(first, second);
                break;
            case (3):
                result = CalculatorUtils.multiplication(first, second);
                break;
            case (4):
                result = CalculatorUtils.substraction(first, second);
                break;
        }

        System.out.println("The result is: " + result);
    }
}
