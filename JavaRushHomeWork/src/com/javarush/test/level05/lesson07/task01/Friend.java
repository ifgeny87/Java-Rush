package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    String name;
    int age;
    String gender;

    public void initialize(String a) { name = a; }
    public void initialize(String a, int b) { name = a; age = b; }
    public void initialize(String a, int b, String c) { name = a; age = b; gender = c; }
}
