package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        int a = s.nextInt();

        if(a > 20)
            System.out.println("И 18-ти достаточно");

    }
}
