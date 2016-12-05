package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    String name;
    int weight, age;

    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public Friend(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
}