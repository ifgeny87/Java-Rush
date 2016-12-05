package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    //Напишите тут ваш код
    int centerX, centerY, radius, width;
    String color;

    public Circle(int cX, int cY, int r)
    {
        centerX = cX;
        centerY = cY;
        radius = r;
    }

    public Circle(int cX, int cY, int r, int width)
    {
        centerX = cX;
        centerY = cY;
        radius = r;
        this.width =width;
    }

    public Circle(int cX, int cY, int r, int w, String c)
    {
        centerX = cX;
        centerY = cY;
        radius = r;
        this.width =width;
        color = c;
    }
}
