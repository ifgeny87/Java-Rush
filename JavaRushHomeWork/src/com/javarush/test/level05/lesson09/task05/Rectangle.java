package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая
координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int top, left, width, height;

    public Rectangle(int t, int l)
    {
        initialize(t, l, 10, 10);
    }

    public Rectangle(int t, int l, int w)
    {
        initialize(t, l, w, w);
    }

    public Rectangle(int t, int l, int w, int h) {
        initialize(t, l, w, h);
    }

    public void initialize(int t, int l, int w, int h)
    {
        top = t;
        left = l;
        width = w;
        height = h;
    }

    public Rectangle(Rectangle rect)
    {
        initialize(rect.top, rect.left, rect.width, rect.height);
    }
}