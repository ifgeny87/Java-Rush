package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не
введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;
        String word = null;
        Scanner scan = new Scanner(System.in);

        while(!"сумма".equals(word))
        {
            word = scan.nextLine();
            if(!"сумма".equals(word))
                sum += Integer.valueOf(word);

        }

        System.out.println(sum);
    }
}
