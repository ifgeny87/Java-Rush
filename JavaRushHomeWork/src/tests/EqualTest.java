package tests;

/**
 * Created by budy on 01.12.2016.
 */
public class EqualTest
{
    public static void main(String[] args)
    {
        String mask = "%d) %s\n";
        int i = 0;

        // Сравнение строк

        String s1 = "string";
        String s2 = "string";
        System.out.printf(mask, ++i, s1 == s2);             // 1) true

        String s3 = "str";
        String s4 = "ing";
        System.out.printf(mask, ++i, s1 == (s3 + s4));      // 2) false
        System.out.printf(mask, ++i, s1.equals(s3 + s4));   // 3) true
        System.out.printf(mask, ++i, (s3 + s4).equals(s1)); // 4) true

        String s5 = new String("string");
        System.out.printf(mask, ++i, s1 == s5);             // 5) false
        System.out.printf(mask, ++i, s1.equals(s5));        // 6) true
        System.out.printf(mask, ++i, s5.equals(s1));        // 7) true

        System.out.printf(mask, ++i, s1 == (s3.intern() + s4.intern()));  // 8) false
        System.out.printf(mask, ++i, s1 == (s3 + s4).intern());           // 9) true

        // Числовые операции

        System.out.println("\nNumeric tests");
        System.out.println(.7f);                    // 0.7
        System.out.println(.3f + .4f);              // 0.70000005
        System.out.println(0/1f + " and " + 0/-1f); // 0.0 and -0.0
        System.out.println("Infinity: " + 1/0f + ", -Infinity: " + -1/0f + ", NaN: " + 0/-0f);
        System.out.println((double)(7/10));                 // 0.0
        System.out.println(Integer.toBinaryString(1));      // 1
        System.out.println(Integer.toBinaryString(-1));     // 11111111111111111111111111111111

        float nan = 0f/0f;
        System.out.println(nan + ", " + (nan == nan));      // NaN, false
    }
}
