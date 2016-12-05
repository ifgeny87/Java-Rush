package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    String name;
    int weight, age;
    String color, address;

    public void initialize(String name)
    {
        initialize(name, 4, 3);
    }

    public void initialize(String name, int weight)
    {
        initialize(name, weight, 3);
    }

    public void initialize(String name, int weight, int age)
    {
        initialize(name, weight, age, null);
    }

    public void initialize(String name, int weight, int age, String color)
    {
        initialize(name, weight, age, color, null);
    }

    public void initialize(String name, int weight, int age, String color, String address)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;

    }
}
