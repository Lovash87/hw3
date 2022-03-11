package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // задание тест

        int age = 6;
        if (age == 18) {
            System.out.println("С окончанием школы ");
        } else if (age == 21) {
            System.out.println("Теперь можно бухать ");
        } else if (age == 7) {
            System.out.println("Иди в школу ");}
        else {
            System.out.println("Пока сказать нечего ");}


        // задание 1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");}
        else {
            System.out.println("Установите версию приложения для IOS по ссылке");}


        // задание 2

        int clientDeviceYear = 2015;
        int clientOs = 1;

        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Ios по ссылке");}
            if (clientDeviceYear >= 2015 && clientOs == 1) {
                System.out.println("Установите обычную версию приложения для Ios по ссылке");
            } else if (clientDeviceYear <2015 && clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");}
            else if (clientDeviceYear >= 2015 && clientOs == 0) {
                System.out.println("Устнаовите облегченную версию приложения для Android по ссылке");}


   // задание 3
        int year = 2021;
        if (year == 2021) {
            System.out.println("2025 год является высокостным");}
        else if (year >= 2021) {
            System.out.println("2020 год не является высокостным");}



    }
}