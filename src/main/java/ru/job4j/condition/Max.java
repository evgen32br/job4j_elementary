package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int third) {
        return Math.max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second, third), fourth);
    }

    public static void main(String[] args) {
        int rsl = max(5, 9);
        System.out.println(rsl);
        rsl = max(15, 9, 13);
        System.out.println(rsl);
        rsl = max(5, 19, 13, 1);
        System.out.println(rsl);
    }
}