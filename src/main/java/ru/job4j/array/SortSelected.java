package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int indexOne = 0; indexOne < data.length; indexOne++) {
            int min = MinDiapason.findMin(data, indexOne, data.length - 1);
            int indexTwo = FindLoop.indexOf(data, min, indexOne, data.length - 1);
            SwitchArray.swap(data, indexOne, indexTwo);
        }
        return data;
    }
}
