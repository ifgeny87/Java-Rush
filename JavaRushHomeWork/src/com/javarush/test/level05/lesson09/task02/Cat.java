package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не
известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    String name, color, address;
    int weight, age;

    public Cat(String name)
    {
        initialize(name, 1, 2, null, null);
    }

    public Cat(String n, int w, int a)
    {
        initialize(n, w, a, null, null);
    }

    public Cat(String n, int a)
    {
        initialize(n, 2, a, null, null);
    }

    public Cat(int w, String c)
    {
        initialize(null, w, 2, c, null);
    }

    public Cat(int w, String c, String address)
    {
        initialize(null, w, 2, c, address);
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
