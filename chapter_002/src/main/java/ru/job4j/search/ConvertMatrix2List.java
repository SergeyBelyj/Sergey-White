package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] a : array ) {
            for (int i = 0; i < a.length; i++) {
                list.add(a[i]);
            }
        }
        return list;
    }
}