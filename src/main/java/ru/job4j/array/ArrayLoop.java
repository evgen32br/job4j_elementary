package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] result = new int[5];
        for (int index = 0; index < result.length; index++) {
            result[index] = index * 2 + 3;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
