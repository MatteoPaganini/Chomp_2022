import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public int[][] loseBoards;
    int amtLoseBoards = 0;

    public MyPlayer() {
        columns = new int[10];

        loseBoards = new int[3][5]; //3 numbers makes one board, 5 total boards

        //hard coding the first "lose board"
        loseBoards[0][0] = 1;
        loseBoards[1][0] = 0;
        loseBoards[2][0] = 0;
        amtLoseBoards = 1;


        System.out.println(gameBoard);

        for (int a = 1; a <= 3; a++) {
            for (int b = 0; b <= 3; b++) {
                for (int c = 0; c <= 3; c++) {

                    //surround it with an if statement
                    if (a >= b && b >= c) {
                        System.out.println(a + " " + b + " " + c);
                        ResultingBoards(a, b, c);
                        System.out.println(" ");
                        System.out.println("Next Board:");
                    }
                }
            }
        }


        // ResultingBoards();
    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;

        toColumns();

        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

    public void toColumns() {

        int column0 = 0;
        int column1 = 0;
        int column2 = 0;
        int column3 = 0;
        int column4 = 0;
        int column5 = 0;
        int column6 = 0;
        int column7 = 0;
        int column8 = 0;
        int column9 = 0;

        for (int r = 0; r < gameBoard.length; r++) {

            for (int c = 0; c < gameBoard[r].length; c++) {

                System.out.println("(" + c + "," + r + ")");
                //loop through column for until (x, 2)
                //add 1 for each cell as you loop through the column

            }

            if (gameBoard[r][0].isAlive) {
                column0 = column0 + 1;
                columns[0] = column0;
            }

            if (gameBoard[r][1].isAlive) {
                column1 = column1 + 1;
                columns[1] = column1;
            }

            if (gameBoard[r][2].isAlive) {
                column2 = column2 + 1;
                columns[2] = column2;
            }

            if (gameBoard[r][3].isAlive) {
                column3 = column3 + 1;
                columns[3] = column3;
            }

            if (gameBoard[r][4].isAlive) {
                column4 = column4 + 1;
                columns[4] = column4;
            }

            if (gameBoard[r][5].isAlive) {
                column5 = column5 + 1;
                columns[5] = column5;
            }

            if (gameBoard[r][6].isAlive) {
                column6 = column6 + 1;
                columns[6] = column6;
            }

            if (gameBoard[r][7].isAlive) {
                column7 = column7 + 1;
                columns[7] = column7;
            }

            if (gameBoard[r][8].isAlive) {
                column8 = column8 + 1;
                columns[8] = column8;
            }

            if (gameBoard[r][9].isAlive) {
                column9 = column9 + 1;
                columns[9] = column9;
            }


        }

        System.out.println(column0);
        System.out.println(column1);
        System.out.println(column2);
        System.out.println(column3);
        System.out.println(column4);
        System.out.println(column5);
        System.out.println(column6);
        System.out.println(column7);
        System.out.println(column8);
        System.out.println(column9);


        System.out.println(Arrays.toString(columns));
    }

    public void ResultingBoards(int a, int b, int c) {

        boolean idk = false;

        if (a > 0 && b >= 0 && c >= 0) {
            System.out.println("Resulting Boards:");
            int a1 = a;
            int b1 = b;
            int c1 = c;
            int c2;


            // we want to loop through C until C=0
            //make a for loop for C, and put the sout in body of for loop

            for (int x = c; x > 0; x--) {
                c1 = c1 - 1;
                System.out.println(a + " " + b + " " + c1);

                for (int j = 0; j < loseBoards[0].length; j++) {
                    if (a == loseBoards[0][j] && b == loseBoards[1][j] && c1 == loseBoards[2][j]) {
                        System.out.println("Found a lose board");
                        idk = true;
                    }
                }
            }
            c1 = c;

            for (int y = b; y > 0; y--) {
                b1 = b1 - 1;
                if (b1 < c1) {
                    c1 = b1;
                }
                System.out.println(a + " " + b1 + " " + c1);

                for (int i = 0; i < loseBoards[0].length; i++) {
                    if (a == loseBoards[0][i] && b1 == loseBoards[1][i] && c1 == loseBoards[2][i]) {
                        System.out.println("Found a lose board");
                        idk = true;
                    }
                }

            }

            b1 = b;
            c1 = c;
            for (int z = a; z > 1; z--) {
                a1 = a1 - 1;

                if (a1 < b1) {
                    b1 = a1;
                } //comparing a1 to b1
                if (a1 < c1) {
                    c1 = a1;
                } //comparing a1 to c1

                System.out.println(a1 + " " + b1 + " " + c1);

                for (int h = 0; h < loseBoards[0].length; h++) {
                    if (a1 == loseBoards[0][h] && b1 == loseBoards[1][h] && c1 == loseBoards[2][h]) {
                        System.out.println("Found a lose board");
                        idk = true;
                    }
                }
            }

            if (idk == false) { //finding the rest of the lose boards
                loseBoards[0][amtLoseBoards] = a;
                loseBoards[1][amtLoseBoards] = b;
                loseBoards[2][amtLoseBoards] = c;
                amtLoseBoards = amtLoseBoards + 1;


            }

        }


    }

}
