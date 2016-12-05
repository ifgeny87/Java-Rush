package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static class Man {
        String name;
        int age;
        String address;

        public void initialize(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }

        public Man(String name)
        {
            initialize(name, 20, null);
        }

        public Man(String name, int age)
        {
            initialize(name, age, null);
        }

        public Man(String name, int age, String address)
        {
            initialize(name, age, address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public void initialize(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }

        public Woman(String name)
        {
            initialize(name, 20, null);
        }

        public Woman(String name, int age)
        {
            initialize(name, age, null);
        }

        public Woman(String name, int age, String address)
        {
            initialize(name, age, address);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(new Man("", 2, ""));
        System.out.println(new Man("Vasya", 24, "Polsa"));

        System.out.println(new Woman("Natasha", 24, "Kirov"));
        System.out.println(new Woman("Marina", 26, "Kemerovo"));
    }



}
