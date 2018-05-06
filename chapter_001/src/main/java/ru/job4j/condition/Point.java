package ru.job4j.condition;

/**
 * @author Sergey Belyj (sergiuszbelyj@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distanceTo(Point that) {
        System.out.println(Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)));
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}