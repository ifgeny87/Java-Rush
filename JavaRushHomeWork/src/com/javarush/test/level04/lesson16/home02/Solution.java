package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое бол
ьшое и не самое маленькое.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),
            b = s.nextInt(),
                c = s.nextInt();

        if(a > b && a < c)
            System.out.println(a);
        else if(b > a && b < c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
