package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        Scanner s=new Scanner(System.in);
        int i = 0, sum = 0;
        while(i != -1) {
            i = s.nextInt();
            sum+=i;
        }
        System.out.println(sum);
    }
}
