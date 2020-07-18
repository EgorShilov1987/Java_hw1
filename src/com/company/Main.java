package com.company;

public class Main {

    public static void main(String[] args){
        float a = 10;float b = 30; float c = 10;float d = 30;
        float x = a * (b + (c / d));
        System.out.println(x);
    }

    public static boolean task10and20(int x1, int x2){
        if(x1 >= 10 && x2 <= 20){
            return true;
        } else {
            return false;
        }
    }
    public static void isPositiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println("Это положительное число.");
        } else {
            System.out.println("Это отрицательное число.");
        }
    }
    public static boolean isNegative(int x) {
        if(x<0) {
            return true;
        }
        return false;
    }
    public static void greetings(String name) {
        System.out.println("Привет! " + name);
    }
    public static void year(int i) {      //Не совсем понятно как правильно написать условия!!!
        if(i%4 == 0 && i%100 != 0 && i%400 == 0) {
            System.out.println("Это високосный год.");
        } else {
            System.out.println("Это не високосный год");
        }
    }
}


