package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: маму, папу, сына, дочь, бабушку(мамина мама) и дедушку(папин папа).
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat deda = new Cat(reader.readLine());
        Cat baba = new Cat(reader.readLine());
        Cat papa = new Cat(reader.readLine(), deda);
        Cat mama = new Cat(reader.readLine(), null, baba);
        Cat sina = new Cat(reader.readLine(), papa, mama);
        Cat docha = new Cat(reader.readLine(), papa, mama);

        System.out.println(deda);
        System.out.println(baba);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(sina);
        System.out.println(docha);
    }

    public static class Cat
    {
        private String name;
        private Cat father, mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat father)
        {
            this.name = name;
            this.father = father;
        }

        Cat(String name, Cat father, Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            String m = (mother == null) ? "no mother" : "mother is " + mother.name;
            String f = (father == null) ? "no father" : "father is " + father.name;

            return "Cat name is " + name + ", " + m + ", " + f;
        }
    }

}
