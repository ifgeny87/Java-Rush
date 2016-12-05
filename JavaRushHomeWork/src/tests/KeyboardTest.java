package tests;

import java.io.*;
import java.util.Scanner;

/**
 * Created by budy on 01.12.2016.
 */
public class KeyboardTest
{
    public static void main(String[] args) throws IOException
    {
        // Способ №1. Через InputStream
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("1) Type your name and age");

        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + ", " + nAge);

        // Способ №2. Через Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("2) Type your name and age again");

        name = scanner.nextLine();
        nAge = scanner.nextInt();

        System.out.println(name + ", " + nAge);
    }
}
