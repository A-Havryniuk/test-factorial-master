package com.epam.rd.autotasks;

public class Factorial {
    public String factorial(String n) {
       Integer number = Integer.parseInt(n);
       if(number<0)
           throw new IllegalArgumentException();
       if(number<=1)
           return number.toString();
       Integer fact = 1;
       while (number>1)
       {
           fact *= number;
           number--;
       }
       return number.toString();
    }
}
