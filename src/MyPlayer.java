import java.awt.*;
import java.util.Arrays;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */

        System.out.println(gameBoard);

        for (int a = 0; a <= 3; a++){
            for(int b = 0; b <= 3; b++ ){
                for (int c = 0; c <= 3; c++){
                    System.out.println(a + " " + b + " " + c);

                    //souround it with an if statement
                }
            }
        }
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

    public void toColumns(){

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

        for (int r = 0; r < gameBoard.length; r++){

            for (int c = 0; c < gameBoard[r].length; c++){

                System.out.println("(" + c + "," + r + ")");
                //loop through column for until (x, 2)
                //add 1 for each cell as you loop through the column

            }

            if (gameBoard[r][0].isAlive){
                column0 = column0 + 1;
                columns[0] = column0;
            }

            if (gameBoard[r][1].isAlive){
                column1 = column1 + 1;
                columns[1] = column1;
            }

            if (gameBoard[r][2].isAlive){
                column2 = column2 + 1;
                columns[2] = column2;
            }

            if (gameBoard[r][3].isAlive){
                column3 = column3 + 1;
                columns[3] = column3;
            }

            if (gameBoard[r][4].isAlive){
                column4 = column4 + 1;
                columns[4] = column4;
            }

            if (gameBoard[r][5].isAlive){
                column5 = column5 + 1;
                columns[5] = column5;
            }

            if (gameBoard[r][6].isAlive){
                column6 = column6 + 1;
                columns[6] = column6;
            }

            if (gameBoard[r][7].isAlive){
                column7 = column7 + 1;
                columns[7] = column7;
            }

            if (gameBoard[r][8].isAlive){
                column8 = column8 + 1;
                columns[8] = column8;
            }

            if (gameBoard[r][9].isAlive){
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

    public void Rules(){
        //may have to insert rules inside the second for loop
        //if a cell is alive and is clicked, all cells up and to the right are dead
        //if a cell (0,0) is clicked then game is over
    }

}
