package com.example.calc;

public class Calculator {
    public Double sum(double a,double b){
        return a + b;
    }

    public Double multiplication(double a,double b){
        return a * b;
    }

    public Double subtraction(double a,double b){
        return a - b;
    }

    public Double division(double a,double b){
        return a / b;
    }

    public Double sqrt(double a){
        return Math.sqrt(a);
    }

    public Double pow(double a, double b){
        return Math.pow(a, b);
    }
}