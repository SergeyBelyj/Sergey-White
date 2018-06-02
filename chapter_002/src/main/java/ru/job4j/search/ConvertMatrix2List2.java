package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List2 {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] a : array) {
            for (int b : a) {
                list.add(b);
            }
        }
        return list;
    }
}