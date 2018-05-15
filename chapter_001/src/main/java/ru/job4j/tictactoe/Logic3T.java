package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        if ((this.table[0][0].hasMarkX() && this.table[0][1].hasMarkX() && this.table[0][2].hasMarkX())) { result = true; }
        else if ((this.table[1][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[1][2].hasMarkX())) {result = true;}
        else if ((this.table[2][0].hasMarkX() && this.table[2][1].hasMarkX() && this.table[2][2].hasMarkX())) {result = true;}
        else if ((this.table[0][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[2][2].hasMarkX())) {result = true;}
        else if ((this.table[2][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[0][2].hasMarkX())) {result = true;}
        else  if ((this.table[0][0].hasMarkX() && this.table[1][0].hasMarkX() && this.table[2][0].hasMarkX())) {result = true;}
        else  if ((this.table[1][0].hasMarkX() && this.table[1][1].hasMarkX() && this.table[2][1].hasMarkX())) {result = true;}
        else  if ((this.table[0][2].hasMarkX() && this.table[1][2].hasMarkX() && this.table[2][2].hasMarkX())) {result = true;}


         return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        if ((this.table[0][0].hasMarkO() && this.table[0][1].hasMarkO() && this.table[0][2].hasMarkO())) { result = true; }
        else if ((this.table[1][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[1][2].hasMarkO())) {result = true;}
        else if ((this.table[2][0].hasMarkO() && this.table[2][1].hasMarkO() && this.table[2][2].hasMarkO())) {result = true;}
        else if ((this.table[0][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[2][2].hasMarkO())) {result = true;}
        else if ((this.table[2][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[0][2].hasMarkO())) {result = true;}
        else  if ((this.table[0][0].hasMarkO() && this.table[1][0].hasMarkO() && this.table[2][0].hasMarkO())) {result = true;}
        else  if ((this.table[1][0].hasMarkO() && this.table[1][1].hasMarkO() && this.table[2][1].hasMarkO())) {result = true;}
        else  if ((this.table[0][2].hasMarkO() && this.table[1][2].hasMarkO() && this.table[2][2].hasMarkO())) {result = true;}


        return result;
    }

    public boolean hasGap() {
        boolean result = true;
        int i = 0;
        for (int row = 0; row < this.table.length; row++) {
            for (int cell = 0; cell < this.table.length ; cell++) {
                if (this.table[row][cell].hasMarkO() || this.table[row][cell].hasMarkX()) {
                    i++;
                }
            }
            }
            if (i == 9) {
            result = false;
            }

        return result;
    }
}