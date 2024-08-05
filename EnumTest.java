package enums;

import java.util.*;

public class EnumTest
{
    public static void main(String[] args)
    {
        var in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL. MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" +size);
        System.out.println("abbrevation=" + size.getAbbrivation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _");
    }
}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbrevation) { this.abbrevation = abbrevation; }
    public String getAbbrivation() { return abbrevation;}

    private String abbrevation;
}