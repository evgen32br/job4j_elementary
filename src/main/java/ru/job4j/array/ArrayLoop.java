package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] result = new int[5];
        for (int index = 0; index < result.length; index++) {
            result[index] = index * 2 + 3;
        }
        for (int j : result) {
            System.out.println(j);
        }

    }
}
