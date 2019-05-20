package pakiet1.pl.sdacademy;

import java.util.Arrays;

import static java.util.Arrays.fill;

public class Maze {

    char[][] board = new char[5][5];
    int positionX;
    int positionY;
    int orientation = 0;

    public void setBoard() {
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                board[i][j] = '+';
            }
        }
        for (int j = 0; j < 2; j++) {
            board[2][j] = ' ';
        }
        for (int j = 1; j < 4; j++) {
            board[3][j] = ' ';
        }
        board[3][3] = ' ';
        board[2][3] = ' ';
        board[1][3] = ' ';
        board[1][4] = ' ';


    }

    public void getBoard() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void solve() {
        setBoard();
        getBoard();
        start();
        getBoard();

        while (positionX < 4) {
            isEmpty();
            nextStep();
            getBoard();
        }

        System.out.println("You've done it");
    }

    public void start() {
        positionX = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][0] == ' ') {
                positionY = i;
                break;
            }
        }
        board[positionY][positionX] = '#';
    }

    //    down
//    public void isEmptyPlaceBelow() {
//        if (board[positionY + 1][positionX] == ' ') orientation = 1;
//    }

//    public void isEmptyPlaceOnLeft() {
//        if (board[positionY - 1][positionX] == ' ') orientation = 2;
//    }

//    public void isEmptyPlaceAbove() {
//        if (positionX != 0) {
//            if (board[positionY][positionX - 1] == ' ') orientation = 3;
//        }
//    }

//    public void isEmptyPlaceOnRight() {
//        if (board[positionY][positionX + 1] == ' ') orientation = 0;
//    }

    public void isEmpty() {
        if (orientation == 0) { // right
            if (board[positionY + 1][positionX] == ' ') orientation = 1;
            else if (board[positionY][positionX + 1] != ' '){
                if (positionX != 0) { if (board[positionY - 1][positionX] == ' ') orientation = 3; }
                else if (board[positionY - 1][positionX] == ' ') orientation = 2;
            }
        } else if (orientation == 1) { // down
            if (board[positionY - 1][positionX] == ' ') orientation = 2;
            else if (board[positionY + 1][positionX ] != ' '){
                if (board[positionY][positionX + 1] == ' ') orientation = 0;
                else if (positionX != 0) { if (board[positionY][positionX - 1] == ' ') orientation = 3; }
            }
        } else if (orientation == 2) { // left
            if (positionX != 0) { if (board[positionY][positionX - 1] == ' ') orientation = 3; }
            else if (board[positionY][positionX - 1] != ' ') {
                if (board[positionY + 1][positionX] == ' ') orientation = 1;
                else if (board[positionY][positionX + 1] == ' ') orientation = 0;
            }
        } else {
            if (board[positionY][positionX + 1] == ' ') orientation = 0;
            else if (board[positionY - 1][positionX] != ' ') {
                if (board[positionY - 1][positionX] == ' ') orientation = 2;
                else if (board[positionY + 1][positionX] == ' ') orientation = 1;
            }
        }
    }

    public void nextStep() {
//        right
        if (orientation == 0) {
            positionX++;
        }
//        down
        else if (orientation == 1) {
            positionY++;
        }
//        left
        else if (orientation == 2) {
            positionX--;
        }
//        up
        else if (orientation == 3) {
            positionY--;
        }
        board[positionY][positionX] = '#';
    }


}
