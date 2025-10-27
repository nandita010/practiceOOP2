package ie.atu.week1;

import java.util.Scanner;

public class mainApp {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


//Create an instance of Calculator
BasicCalc calc = new BasicCalc();
        System.out.println("Simple Calculator- divide two numbers");
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();

        int result= calc.mod(a, b);
       // int result = calc.pow(a, b);
        System.out.println("Result: " +result);

        sc.close();
    }
}