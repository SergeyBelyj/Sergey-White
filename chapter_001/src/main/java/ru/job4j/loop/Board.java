package ru.job4j.loop;

public class Board {
    public  StringBuffer paint(int width, int height) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i <= height; i++) {
        for (int j = 0; j <= width; j++) {
            if (((i + j) % 2) == 0) {
                sb.append("X");
            } else {
                sb.append(" ");
            }
        }
        sb.append("/n");
    }
        return sb;
    }
}