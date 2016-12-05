package tests;

import java.util.ArrayList;

/**
 * Created by marina on 04.12.2016.
 */
public class ArrayTest
{
    public static void main(String[] args)
    {
        // дженерик ArrayList может хранить объект любого типа
        ArrayList list = new ArrayList();

        list.add(new ArrayTest());
        list.add(true);
        list.add(123);
        list.add(.987f);
        list.add("Hello Kitty");

        for (Object o: list             )
        {
            System.out.println(o);
        }
    }
}
