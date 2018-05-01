package ru.job4j.loop;

public class Board {
    public  String paint(int width, int height) {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i <= height; i++) {
        for (int j = 0; j <= width; j++) {
            if (((i + j) % 2) == 0) {
                sb.append("X");
            } else {
                sb.append(" ");
            }
        }
        sb.append(System.lineSeparator());
    }
        return sb.toString();
    }
}