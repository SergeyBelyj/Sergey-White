package ru.job4j.search;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() % rows);

        int[][] array = new int[rows][rows];
        int i = 0;
        int j = 0;
          for (Integer ar : list) {
              if (j < rows) {
                  array[i][j] = ar;
                  j++;
              } else {
                  i++;
                  j = 0;
                  array[i][j] = ar;
                  j++;
              }
          }


        return array;
    }
}