package com.gmail.vptarasov1998;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Введите название месяца:");
        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine().toUpperCase();
        Month month = keyMonth(m);

       System.out.println("Порядковый номер в году этого месяца - " + (month.ordinal()+1));


    }

    public enum Month{
        JANUARY("ЯНВАРЬ"),
        FEBRUARY("ФЕВРАЛЬ"),
        MARCH("МАРТ"),
        APRIL("АПРЕЛЬ"),
        MAY("МАЙ"),
        JUNE("ИЮНЬ"),
        JULY("ИЮЛЬ"),
        AUGUST("АВГУСТ"),
        SEPTEMBER("СЕНТЯБРЬ"),
        OCTOBER("ОКТЯБРЬ"),
        NOVEMBER("НОЯБРЬ"),
        DECEMBER("ДЕКАБРЬ");

        private String rusName;

        Month(String n){
            rusName = n;
        }
        String getRusName(){
            return rusName;
        }

    }
    private static Month keyMonth(String x){
        Month month = null;
        for(Month key: Month.values()) {
            try {
                if (key.getRusName().equals(x)) {
                    month = key;
                } else if (key.equals(Month.valueOf(x))) {
                    month = key;
                }
            } catch (Exception e) {

            }

        }
        return month;
    }
    }

