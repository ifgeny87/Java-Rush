package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        int
            a = s.nextInt(),
                b = s.nextInt(),
                c = s.nextInt(),
                d = s.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));

    }
}
