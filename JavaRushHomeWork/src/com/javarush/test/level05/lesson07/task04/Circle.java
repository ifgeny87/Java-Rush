package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    int centerX, centerY, radius, width;
    String color;

    public void initialize(int cX, int cY, int r)
    {
        centerX = cX;
        centerY = cY;
        radius = r;
    }

    public void initialize(int cX, int cY, int r, int width)
    {
        initialize(cX, cY, r);
        this.width =width;
    }

    public void initialize(int cX, int cY, int r, int w, String c)
    {
        initialize(cX, cY, r, w);
        color = c;
    }
}
