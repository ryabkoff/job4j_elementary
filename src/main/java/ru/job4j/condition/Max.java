package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int tmp = max(second, third);
        return first > tmp ? first : tmp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(second, third, fourth);
        return first > tmp ? first : tmp;
    }
}