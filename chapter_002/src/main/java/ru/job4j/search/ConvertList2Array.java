package ru.job4j.search;

import java.util.Collections;
import java.util.List;

public class ConvertList2Array {
    List<Integer> result = null;

    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);

        int[][] array = new int[rows][cells];
        int i = rows;
        rows = 0;
        cells = 0;
          for (Integer ar : list) {
              if (cells < i) {
                  array[rows][cells] = ar;
                  cells++;
              } else {
                  rows++;
                  cells = 0;
                  array[rows][cells] = ar;
                  cells++;
              }
          }


        return array;
    }

    public List<Integer> convert(List<int[]> list2) {
        for (int[] ar : list2) {
            for (int index = 0; index < ar.length; index++) {
                result.add(ar[index]);
            }
        }
        return result;
    }
}