//17.	В заданном целом числе X (-1000 <= X <= 1000) определить наибольшую и наименьшую цифры.
package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void countMin(int a){
        int min;

        int f1 = a/100;
        int f2 = (a / 10) % 10;
        int f3 = a % 10; // находим цифры

        if (f1 < f2 ){
            min = f1;
        } else {
            min = f2;
        }
        if (min > f3){
            min = f3;
        }
        System.out.println("Минимальная цифра - " + min);
    }

    public static void countMax(int a){
        int max;

        int f1 = a/100;
        int f2 = (a / 10) % 10;
        int f3 = a % 10; // находим цифры

        if (f1 > f2 ){
            max = f1;
        } else {
            max = f2;
        }
        if (max < f3){
            max = f3;
        }
        System.out.println("Максимальная цифра - " + max);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число ");
        int a = sc.nextInt();

        if ((a == 1000) || (a == -1000))  {
            System.out.println("Минимальная цифра - 0, максимальная - 1");

        } else if (a  >= 0) {
            countMin(a);
            countMax(a);
        } else {
            a = a * (-1);
            countMin(a);
            countMax(a);
        }

    }

}
