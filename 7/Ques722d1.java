/* I am Baadoo. Not one of those boys! @Madara, _where
 * The principle behind the code is simple.
 * The array feasible contains elements representing feasible moves of the knight from 
 * each row or colum in the array. Feasible moves here imply moves that won't cause the knight to move off the board.
 * It's divided into two elements. feasible[0] represents 
 * feasible moves from the row perspective, while feasible[1] represents feasible moves from the 
 * column perspective. The first element of feasible[0] represents moves that are possible at any point on row 0
 * of the chessboard. 
 * Thus, for each position/cell/coordinate, the feasible moves could be obtained by crossing its
 * value with its column value. This means obtaining moves common to both the row and column.
 * Each element of feasible[0][0] is a feasible move if the current position is on row 0. 
 * This means moves 4, 5, 6, and 7 are possible in any element of row 0. feasible[0][0][0] is 4.
 * Move 4 involves going right once(i.e currentRow += vertical[4] and going down twice (i.e currentColumn
 * += horizontal[4]). 
 * The analogy also applies to the column values. At any point on column 0, the feasible moves are the elements of 
 * feasible[1][0] - 0, 1, 6 and 7.
 * Thus, if the knight is in a point such as [0][0] on the chessboard (the top left hand corner), the program compares each
 * of the elements of the feasible moves from both the row and column perspective.
 * Values common to both are the possible moves at cell [0][0]. In our case of [0][0], feasible moves common to both the row
 * and column are 6 and 7.
 * The knight starts from position [0][0]
 */
import java.util.Arrays;
import java.util.ArrayList; // import ArrayList class
public class Ques722d1
{
    private static final int[][][] feasible = {{{4,5,6,7}, {0,3,4,5,6,7}, {0,1,2,3,4,5,6,7}, 
        {0,1,2,3,4,5,6,7}, {0,1,2,3,4,5,6,7}, {0,1,2,3,4,5,6,7}, {0,1,2,3,4,7}, {0,1,2,3}}, 
        {{0,1,6,7}, {0,1,2,5,6,7}, {0,1,2,3,4,5,6,7}, {0,1,2,3,4,5,6,7}, {0,1,2,3,4,5,6,7}, 
            {0,1,2,3,4,5,6,7}, {1,2,3,4,5,6}, {2,3,4,5}}}; // array of feasible moves (read from line 3)
    private static ArrayList<Integer> currentArr = new ArrayList<Integer>(); // arraylist to store feasible moves for a cell
    private static int currentRow = 0; // starting point (row)
    private static int currentColumn = 0; // starting point (column)
    private static int[][] board = new int[8][8]; // chess board
    private static int[][] accessibility = {{2,3,4,4,4,4,3,2}, {3,4,6,6,6,6,4,3}, {4,6,8,8,8,8,6,4},
        {4,6,8,8,8,8,6,4}, {4,6,8,8,8,8,6,4}, {4,6,8,8,8,8,6,4}, {3,4,6,6,6,6,4,3}, {2,3,4,4,4,4,3,2}}; // accessibility array
    private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2}; // array of horizontal moves
    private static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1}; // array of vertical moves
    private static ArrayList<Integer> check = new ArrayList<Integer>(); // arraylist to store least accessible positions (stores row)
    private static ArrayList<Integer> check1 = new ArrayList<Integer>(); // arraylist to store least accessible positions (stores column)
    private static int lAccess; // variable used in determining least accessible
    private static int check4; // variable used in process of determining least accessible
    public static void main(String[] args)
    {
        int loop = 0; // to keep count of moves made (tally)
        for (int counter = 1; counter <= 64; counter++) // loop to run 64 times, if possible
        { 
            currentFeasible(currentRow, currentColumn); // method that adds feasible moves to Arraylist, currentArr
            lAccess = 0; // initialize index-value for least accessible in arraylists, check and check1, at the beginning of each loop
            board[currentRow][currentColumn] = counter; // set the cell value to be equal to move tally, before changing values.
            accessibility[currentRow][currentColumn]--; // reduce accessibility value as knight touches position
            feasibleLeast(currentRow, currentColumn, check, check1);
            if (check.size() == 0 || check1.size() == 0)
                break; // if no moves are possible, nothing will be added to the arraylists, thus the size of each will be zero
            for (int count = 0; count < check.size(); count++) // loop to determine least accessible
            {
                check4 = accessibility[check.get(lAccess)][check1.get(lAccess)]; // determine value for least accessible at the lAccess point, initially 0
                if (accessibility[check.get(count)][check1.get(count)] <= check4) // compare count value with accessibility value at lAccess point
                    lAccess = count; // if count-accessibility value is less than lAccess value, set lAccess to count
                if (accessibility[check.get(count)][check1.get(count)] == check4) // compare count value with accessibility value at lAccess point
                    lAccess = testAccessible(lAccess, count);
            }
            currentRow = check.get(lAccess); // sets currentRow to least accessible position
            currentColumn = check1.get(lAccess); // sets currentColumn to least accessible position
            loop = counter+1; // to keep track of moves
        }
        System.out.printf("Counter it reached >> %d\n", loop); // print out number of moves made
        for (int counter = 0; counter < 8; counter++)
        {
            for (int count = 0; count < 8; count++)
            {
                System.out.printf("%d \t", board[counter][count]);  // print chessboard
            }
            System.out.printf("\n\n");
        }
    }
    public static void currentFeasible(int one, int two) // method that sorts for common feasible moves for a cell/position
    {
        currentArr.clear(); // clear all elements of currentArr before starting operation
        int d = 0;  //
        for (int c = 0; c < feasible[0][one].length; c++) // loop through each element of feasible moves of the row (passed as parameter 'one')
        {
            d = feasible[0][one][c]; // sets d equal to each element to compare with elements of feasible moves of the column
            for (int da = 0; da < feasible[1][two].length; da++) // loop through each element of feasible moves of the column(passed as 'two')
            {
                if (d == feasible[1][two][da])  // if they are equal, that is common elements
                    currentArr.add(d);  // add the value to the arraylist, currentArr
            }
        }
    }
    public static void feasibleLeast(int cRow, int cColumn, ArrayList<Integer> check, ArrayList<Integer> check1)
    {
        int check2; // variable used in process of determining least accessible
        int check3; // variable used in process of determining least accessible
        check.clear();
        check1.clear();
        for (int co = 0; co < currentArr.size(); co++) // loops through each element of currentArr
            {
                check2 = cRow + vertical[currentArr.get(co)]; // set variable in order to first test availability of position(row)
                check3 = cColumn + horizontal[currentArr.get(co)]; // set variable in order to first test availability of position(column)
                if (board[check2][check3] != 0) // testing availability. it's available if its value is zero
                    continue; // continues to the next element(feasible move) in currentArr if the value is not zero, that is not available
                check.add(check2); // store value in check arraylist (row value) passed in as parameter
                check1.add(check3); // store value in check1 arraylist (column value) passed in as parameter
            }
    }
    public static int testAccessible(int...vargs)
    {
        ArrayList<Integer> checkcopy = new ArrayList<Integer>(); // copy initial check arraylist so as to work with a copy instead of altering original array
        ArrayList<Integer> check1copy = new ArrayList<Integer>(); // copy initial check1 arraylist so as to work with a copy instead of altering original array
        int[][] accessCopy = new int[8][8];
        System.arraycopy(accessibility, 0, accessCopy, 0, accessibility.length);
        for (int count = 0; count < checkcopy.size(); count++) // loop through arraylists check and check1 and copy values to new arrays
        {
            checkcopy.add(check.get(count));
            check1copy.add(check1.get(count));
        }
        int cuRow;
        int cuCol;
        ArrayList<Integer> tester = new ArrayList<Integer>();
        if (checkcopy.size() == 0 || check1copy.size() == 0)
                return lAccess;
        for (int number : vargs)
        {
            int lAccess2 = 0;
            cuRow = checkcopy.get(number);
            cuCol = check1copy.get(number);
            currentFeasible(cuRow, cuCol);
            accessCopy[cuRow][cuCol]--; // reduce accessibility value as knight touches position
            feasibleLeast(cuRow, cuCol, checkcopy, check1copy);
            for (int count = 0; count < checkcopy.size(); count++) // loop to determine least accessible
            {
                check4 = accessibility[checkcopy.get(lAccess2)][check1copy.get(lAccess2)]; // determine value for least accessible at the lAccess point, initially 0
                if (accessibility[check.get(count)][check1.get(count)] <= check4) // compare count value with accessibility value at lAccess point
                    lAccess2 = count; // if count-accessibility value is less than lAccess value, set lAccess to count
                if (accessibility[check.get(count)][check1.get(count)] == check4) // compare count value with accessibility value at lAccess point
                    lAccess = testAccessible(lAccess, count);
            }
            tester.add(lAccess2);
        }
        int valueRet = tester.get(0);
        if (tester.get(1) <= valueRet)
            valueRet = tester.get(1);
        return valueRet;
    }
}