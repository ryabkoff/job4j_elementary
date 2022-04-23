package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += "But I am a newbie.";
        int year = 2022;
        idea += year;
        System.out.println(idea);

//        long l = 129;
//        byte b = (byte) l;
//        System.out.println(b);

//        float f = 12358.7f;
//        int i = 45981;
//        short rsl = (short) (f + i);
//        System.out.println(rsl);

//        char c = 45000;
//        float i = c;
//        System.out.println(i);

//        double d = 121.19;
//        byte b = (byte) d;
//        System.out.println(b);

        short s = 1500;
        char c = (char) s;
        double d = c;
        System.out.println(d);
    }
}
