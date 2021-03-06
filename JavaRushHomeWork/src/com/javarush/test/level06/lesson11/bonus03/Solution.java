package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(10.5));

        //BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i=0;i<nums.length;i++)
            nums[i] = scan.nextInt();

        Arrays.sort(nums);

        for(int i=0; i<nums.length;i++)
            System.out.println(nums[i]);
    }
}
