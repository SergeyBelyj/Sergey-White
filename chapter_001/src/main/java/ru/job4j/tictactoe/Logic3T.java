package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {

        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = false;
        // проверка в ряд
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = 0; col < this.table.length - 1; col++) {
                    if (this.table[row][col].hasMarkX() && this.table[row][col + 1].hasMarkX()) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // проверка в столбец
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = 0; col < this.table.length - 1; col++) {
                    if (this.table[col][row].hasMarkX() && this.table[col + 1][row].hasMarkX()) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // диагональ 1
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = 0; col < this.table.length - 1; col++) {
                    if (this.table[col][col].hasMarkX() && this.table[col + 1][col + 1].hasMarkX()) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // диагональ 2
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = this.table.length - 1; col > 0; col--) {
                    if ((this.table[col][this.table.length - col - 1].hasMarkX()) && (this.table[col - 1][this.table.length - col].hasMarkX())) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }

         return result;
    }

    public boolean isWinnerO() {
        boolean result = false;
        // проверка в ряд
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = 0; col < this.table.length - 1; col++) {
                    if (this.table[row][col].hasMarkO() && this.table[row][col + 1].hasMarkO()) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // проверка в столбец
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = 0; col < this.table.length - 1; col++) {
                    if (this.table[col][row].hasMarkO() && this.table[col + 1][row].hasMarkO()) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // диагональ 1
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = 0; col < this.table.length - 1; col++) {
                    if (this.table[col][col].hasMarkO() && this.table[col + 1][col + 1].hasMarkO()) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        // диагональ 2
        for (int row = 0; row < this.table.length; row++) {
            if (!result) {
                for (int col = this.table.length - 1; col > 0; col--) {
                    if ((this.table[col][this.table.length - col - 1].hasMarkO()) && (this.table[col - 1][this.table.length - col].hasMarkO())) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            } else {
                break;
            }
        }

        return result;
    }

    public boolean hasGap() {
        boolean result = true;
        int i = 0;
        for (int row = 0; row < this.table.length; row++) {
            for (int col = 0; col < this.table.length ; col++) {
                if (this.table[row][col].hasMarkO() || this.table[row][col].hasMarkX()) {
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