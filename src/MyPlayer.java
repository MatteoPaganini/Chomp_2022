import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
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

        for (int r = 0; r < gameBoard.length; r++){

            for (int c = 0; c < gameBoard[r].length; c++){

                System.out.println("(" + c + "," + r + ")");

                //the following finds the point where we stop (it doesn't actually do anything)
                if (r == 2){
                    if (c == 2){
                        System.out.println("We are at the point (2,2)");
                        System.out.println("We have a 3x3");

                    }
                }
            }

        }





    }

}
