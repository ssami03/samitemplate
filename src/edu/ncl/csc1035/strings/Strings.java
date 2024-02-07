package edu.ncl.csc1035.strings;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String name = "Konrad Dabrowski";
        System.out.println(name);

        int length = name.length();
        System.out.println(length);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.toUpperCase();
        System.out.println(name);

        char c = name.charAt(0);
        System.out.println(c);

        String substring = name.substring(0,6);
        System.out.println(substring);

        char[] chars = substring.toCharArray();
        for (char c1: chars) {
            System.out.println(c1);
        }

        String newString = "something something something else";
        String[] strings = newString.split(" ");
        for (String s: strings) {
            System.out.println(s);
        }

        String name2 = "KONRAD2";
        System.out.println(substring);
        System.out.println(name2);
        boolean b = name2.equals(substring);
        System.out.println(b);

        boolean b2 = name2.contains("NRa");
        System.out.println(b2);

        String concatenatedString = name + " " + name2;
        System.out.println(concatenatedString);
    }
}
