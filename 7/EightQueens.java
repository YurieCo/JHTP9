/* Loops through the board by attempting to solve the eight queens puzzle
 * starting from every cell.
 * The initial loop in the main method assigns values 0 to 7 as the row value
 * and 0 to 7 as column values for each row. Thus going through [0][0] to [7][7]
 * Once the row and column values have been assigned. Method bestOption is called to
 * determine the next best cell according to the heuristic
 * The heuristic(access) array contains values that assign values to cells according to number
 * of cells eliminated by placing a queen in that cell. Check Java: How to Program, for details.
 */
import java.util.ArrayList;
public class EightQueens
{
    private static int[][] board; // chess board
    private static ArrayList<Integer> arrRow = new ArrayList<Integer>(); // used in determining best option
    private static ArrayList<Integer> arrCol = new ArrayList<Integer>(); // used in determining best option
    private static int[][] access = new int[8][8]; // heuristic array for determining best option
    private static int counter2; // store counter value for keeping note of current number of queens placed
    private static int countmain; // determine if eight queens have been placed successfully
    private static int lRow; // current row position for the queen
    private static int lCol; // current column position for the queen
    public static void main(String[] args)
    {
        fillAccess(); // Fill the access array according to the heuristic
        for (int pa = 0; pa < 8; pa++) // loops from 0 to 7 (row value)
        {
            for (int pas = 0; pas < 8; pas++) // loops from 0 to 7 (column value)
            {
                board = new int[8][8]; // initiates new array for chess board
                lRow = pa; // loop through cells (0-7)
                lCol = pas; // loop through columns (0-7)
                countmain = 1;
                for (int counter = 1; counter < 9; counter++)
                {
                    counter2 = counter;
                    bestOption();
                    //cellEliminator(lRow, lCol);
                }
                if (countmain == 8) // if eight queens have been placed on the board
                { // display chess board
                    for (int count = 0; count < 8; count++) //
                    {
                        for (int c = 0; c < 8; c++)
                            System.out.printf("%d\t", board[count][c]);
                        System.out.println();
                    }
                    System.out.printf("\n\n");
                }
            }
        }
    }
    private static void fillAccess() // for filling the access array
    { // assigns heuristic values to cells
        for (int count = 0; count < 8; count++)
        {
            access[0][count] = 22;
            access[count][0] = 22;
            access[7][count] = 22;
            access[count][7] = 22;
        }
        for (int count = 1; count < 7; count++)
        { // next inner
            access[1][count] = 24;
            access[count][1] = 24;
            access[6][count] = 24;
            access[count][6] = 24;
        }
        for (int count = 2; count < 6; count++)
        {
            access[2][count] = 26;
            access[count][2] = 26;
            access[5][count] = 26;
            access[count][5] = 26;
        }
        for (int count = 3; count < 5; count++)
        {
            access[3][count] = 28;
            access[count][3] = 28;
            access[4][count] = 28;
            access[count][4] = 28;
        }
        //unhide the block of code beneath the line to see the heuristic array
        /*for (int count = 0; count < 8; count++) //
        {
            for (int c = 0; c < 8; c++)
                System.out.printf("%d\t", board[count][c]);
            System.out.println();
        }*/
    }
    private static void zeroElements()
    { // loops through the chess board to determine empty cells feasible for positioning the next queen
        arrRow.clear(); // clear arraylist
        arrCol.clear(); // clear arraylist
        for (int count = 0; count < 8; count++)
        {
            for (int c = 0; c < 8; c++)
            {
                if (board[count][c] == 0)
                {
                    arrRow.add(count); // add row index if the cell is feasible, that is, zero
                    arrCol.add(c);  // add column index if the cell is feasible, that is, zero
                }
            }
        }
    }
    private static void bestOption()
    { // determine cell that eliminates the least number of squares and then places a queen there.
        cellEliminator(lRow, lCol); // first eliminate squares with initial cell value
        zeroElements(); // determine feasible cells
        if (arrRow.size() != 0) // if there are feasible cells
        {
            lRow = arrRow.get(0); 
            lCol = arrRow.get(0);
            for (int count = 0; count < arrRow.size(); count++)
            { // loop through feasible cells to determine cell that eliminates least number of cells
                if (access[arrRow.get(count)][arrCol.get(count)] < access[lRow][lCol])
                {
                    lRow = arrRow.get(count);
                    lCol = arrCol.get(count);
                }
            }
            countmain++; // increment variable after successfully selecting a cell to place the next queen
        }
    }
    private static void cellEliminator(int one, int two)
    { // method for eliminating cells, eliminates the row, column and diagonal that's affiliated with the queen
        ArrayList<Integer> diagonal = new ArrayList<Integer>(); 
        ArrayList<Integer> diagonal1 = new ArrayList<Integer>();
        ArrayList<Integer> diagonal2 = new ArrayList<Integer>();
        ArrayList<Integer> diagonal3 = new ArrayList<Integer>();
        int[] row = new int[4];
        int[] column = new int[4];
        for (int count = 0; count < 4; count++)
        {
            row[count] = one; // i need four instances of the row value to work with in eliminating the diagonals
            column[count] = two; // i need four instances of the column value to work with in eliminating the diagonals
        }
        for (int count = 0; count < 8; count++)
        {
            // for eliminating cells in the queen's row
            if (board[one][count] == 0) // if no queen has eaten up the position
                board[one][count] = counter2; // set the cell to the current queen value
            // for eliminating cells in the queen's column
            if (board[count][two] == 0) 
                board[count][two] = counter2;
        }
        // eliminating diagonals of the queen, the four while loops add values without
        // considering if the values added are within the boundaries of the chessboard
        while (row[0] >= 0)
        {
            diagonal.add(row[0]);
            diagonal1.add(column[0]);
            row[0]--;
            column[0]++;
        }
        while (row[1] < 7)
        {
            row[1]++;
            column[1]--;
            diagonal.add(row[1]);
            diagonal1.add(column[1]);
        }
        while (row[2] > 0)
        {
            row[2]--;
            column[2]--;
            diagonal.add(row[2]);
            diagonal1.add(column[2]);
        }
        while (column[3] < 7)
        {
            row[3]++;
            column[3]++;
            diagonal.add(row[3]);
            diagonal1.add(column[3]);
        }
        // determines values withing the bounds of the chessboard, and adds to arraylists, diagonal2 and diagonal3
        for (int p = 0; p < diagonal.size(); p++)
        {
            if (diagonal.get(p) >= 0 && diagonal.get(p) <= 7 && diagonal1.get(p) >= 0
                    && diagonal1.get(p) <= 7)
            {
                diagonal2.add(diagonal.get(p));
                diagonal3.add(diagonal1.get(p));
            }
        }
        for (int t = 0; t < diagonal3.size(); t++) // eliminates diagonals of the cell where the queen is placed
        {
            if (board[diagonal2.get(t)][diagonal3.get(t)] == 0)
                board[diagonal2.get(t)][diagonal3.get(t)] = counter2;
        }
    }
}