package com.thoughtworks.tdd;

public class Dependency {
    public String say(){
        for (int i = 0; i <= 120; i++){
            if(i % 3 == 0){
                if(i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else if(i % 7 == 0){
                    System.out.println("FizzWhizz");
                }else if(i % 5 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzzWhizz");
                }else {
                    System.out.println("Fizz");
                }
            }else if(i % 5 == 0){
                if(i % 7 == 0){
                    System.out.println("BuzzWhizz");
                }else{
                    System.out.println("Buzz");
                }
            }else if(i % 7 == 0){
                System.out.println("Whizz");
            }else{
                System.out.println(i);
            }
        }
        return "Leave me alone.";
    }
}
