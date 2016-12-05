package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = 0;

        for(int i = 0; i< n; i++)
            if(i == 0)
                m = scan.nextInt();
        else
            m = max(m, scan.nextInt());




        System.out.println(m);
    }

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}
