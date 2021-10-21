package com.company;

public class Main {

    public static void main(String[] args) {
        int age= 10;
        int temperature = 20;
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            System.out.println("Мщжно идти гулять");}


        if (age < 20 && temperature >= 0 && temperature <= 28){
            System.out.println("Мщжно идти гулять");}


        if (age > 45 && temperature >= 10 && temperature <= 25){
            System.out.println("Мщжно идти гулять");}


        else System.out.println("Оставайтесь дома");



    }
}
