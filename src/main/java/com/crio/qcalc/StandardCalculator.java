package com.crio.qcalc;

public class StandardCalculator {
    protected double result = 0;
    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }


    public final void add(double num1, double num2){
        double result = num1 + num2;

        if(result == Double.MAX_VALUE || result == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("Double Overflow");
        }
        this.result = result;
    }

    public void add(int num1, int num2){
        result = num1 + num2;
    }


    public void subtract(double num1, double num2){
        double result = num1 - num2;
        if(result == Double.MIN_VALUE || result == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Double Overflow");
        }
        this.result = result;
    }

    public void subtract(int num1, int num2){
        result= num1-num2;
    }


    public final void multiply(double num1, double num2){
        if((num1 == Double.MAX_VALUE || num2 == Double.MAX_VALUE) 
        || (num1 == Double.POSITIVE_INFINITY || num2 == Double.POSITIVE_INFINITY) 
        || (num1 == Double.NEGATIVE_INFINITY || num2 == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double Overflow");
        }
        else{
            result = num1 * num2;
        }
    }

    public void multiply(int num1, int num2){
        result = (int) num1 * num2;
    }

    public final void divide(double num1, double num2){
        if(num1 == 0 || num2 == 0){
            throw new ArithmeticException("Divide by Zero");
        }
        else {
        result = num1 / num2;
        }
    }

    public void divide(int num1, int num2){
        result = num1 / num2;
    }

    public double getResult() {
        return result;
    }

    public void clearResult() {
        result = 0;
    }

    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);

    }
}
