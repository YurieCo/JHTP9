/* I am Baadoo. Not one of those boys! @Madara, _where
 * Good luck at understanding this.
 * Current position of the turtle could be any of four distinct values
 * This is because only four line movements are possible.
 * A movement right, a movement down, a movement left, and a movement up.
 * Before making this movement, it'll be in one of four positions
 * NW before making a movement right, NE before making a movement down, 
 * SE before making a movement left, and SW before making a movement up.
 * NW - NORTH WEST, NE - NORTH EAST, SE - SOUTH EAST, SW - SOUTH WEST
 */
public class Ques721
{
    enum Status{UP, DOWN};  // status of pen - being up or being down
    enum Direction{Right, Left};  // direction to turn - left or right
    enum Mode{NW, NE, SE, SW}; // to keep track of position, more explanation @ line 3
    public static void main(String[] args)
    {
        int[][] arr = {{2}, {5,12}, {3}, {5,12}, {3}, {5,12}, {3}, {5,12},
            {1}, {6}, {9}}; // array of movement variables. the array displays M ;)
        processor(arr);
    }
    public static void processor(int[][] array)
    {// static method to process arguments sent in through the array
        int[][] board = new int[20][20]; // actual board on which the logo drawing takes place
        Direction posit = Direction.Right; // current direction initialized to right
        Mode turMode = Mode.NW; // current position initialized to NW (on the board, (0,0) looks more to the North West quadrant
        Status penStatus = Status.UP; // current pen status initialized to being up
        int start = 0; // store current row position on board
        int start1 = 0;// store current column position on board
        for (int count = 0; count < array.length; count++)
        { // to loop through the array passed in and perform appropriate operation
            if (array[count].length != 2) // to confirm if it involves movement. Only arrays involving movement have two elements(5, number)
            {// only arrays in the form (5, number) will NOT be excluded
                switch(array[count][0])
                {// switch statement to loop through values
                    case 1:
                        penStatus = Status.UP; // set penStatus to UP if it encounters {1}
                        break;
                    case 2:
                        penStatus = Status.DOWN; // set penStatus to DOWN if it encounters {2}
                        break;
                    case 3:
                        posit = Direction.Right; // set position to RIGHT if it encounters {3}
                        break;
                    case 4:
                        posit = Direction.Left; // set position to LEFT if it encounters {4}
                        break;
                    case 6:
                        displayVal(board); // display board by calling method displayVal and passing in the board
                        break;
                    case 9:
                        System.out.println("End of discussion"); // print ending statement
                        break;
                    default:
                        break;
                }
            }
            else // this will process only for 2-element arrays, such as {5, number}
            { // for movement operations 
                int value = array[count][1]; // to get length of movement, the value after 5
                if (turMode == Mode.NW)
                { // in such a position, the only possible movements are increasing/decreasing column values, that is, a line movement right/left
                    if (posit == Direction.Right)
                    { // line movement right, equivalent to moving right at current position  
                        turMode = Mode.NE; // to set the next position for the next possible movement(down or up)
                        for (int counter = 1; counter <= value; counter++)
                        {
                            board[start][start1+counter] = 1; // moving right by setting corresponding columns to 1
                        }                               // it's done in an increasing order
                        start1 += value; // to set the next movement to start from the last point
                    }
                    else // operates if posit is equal to Direction.Left
                    { // line movement left, equivalent to moving left at current position
                        turMode = Mode.SW; // to set the next position for the next possible movement(up or down)
                        for (int counter = 1; counter <= value; counter++)
                        { // loop to move left by setting corresponding columns to 1
                            board[start][start1-counter] = 1; // done in a decreasing order
                        }
                        start1 -= value; // to set the next movement to start from the last point
                    }    
                }
                else if (turMode == Mode.NE)
                { // in such a position, the only possible movements are increasing/decreasing row values, that is, a line movement down/up
                    if (posit == Direction.Right)
                    { // line movement down, equivalent to moving right at current position
                        turMode = Mode.SE; // to set the next position for the next possible movement(left or right)
                        for (int counter = 1; counter <= value; counter++)
                        {// loop to move down by setting corresponding rows to 1
                            board[start+counter][start1] = 1; // it's done in an increasing order
                        }
                        start += value; // to set the next movement to start from the last point
                    }
                    else // operates if posit is equal to Direction.Left
                    { // line movement up, equivalent to moving left at current position
                        turMode = Mode.NW; // to set the next position for the next possible movement(right or left)
                        for (int counter = 1; counter <= value; counter++)
                        { // loop to move up by setting corresponding rows to 1
                            board[start-counter][start1] = 1; // it's done in a decreasing order
                        }
                        start -= value; // to set the next movement to start from the last point
                    }
                }
                else if (turMode == Mode.SE)
                { // in such a position, the only possible movements are decreasing/increasing row values, that is, a line movement left/right
                    if (posit == Direction.Right) 
                    { // line movement left, equivalent to moving right at current position
                        turMode = Mode.SW; // to set the next position for the next possible movement(up or down)
                        for (int counter = 1; counter <= value; counter++)
                        {
                            board[start][start1-counter] = 1;  // moving left by setting corresponding columns to 1
                            // it's done in a decreasing order
                        }
                        start1 -= value; // to set the next movement to start from the last point
                        
                    }
                    else // operates if posit is equal to Direction.Left
                    { // line movement right, equivalent to moving left at current position
                        turMode = Mode.NE; // to set the next position for the next possible movement(down or up)
                        for (int counter = 1; counter <= value; counter++)
                        {
                            board[start][start1+counter] = 1; // moving right, done in an increasing order
                        }
                        start1 += value; // to set the next movement to start from the last point
                    }
                }
                else if (turMode == Mode.SW)
                { // in such a position, the only possible movements are decreasing/increasing column values, that is, a line movement up/down
                    if (posit == Direction.Right)
                    { // line movement up, equivalent to moving right at current position
                        turMode = Mode.NW; // to set the next position for the next possible movement ()
                        for (int counter = 1; counter <= value; counter++)
                        {
                            board[start-counter][start1] = 1; // moving up by setting corresponding rows to 1
                        }                                // it's done in a decreasing order
                        start -= value;
                    }
                    else // operates if posit is equal to Direction.Left
                    { // line movement down, equivalent to moving left at current position
                        turMode = Mode.SE;
                        for (int counter = 1; counter <= value; counter++)
                        {
                            board[start+counter][start1] = 1; // moving down by setting corresponding rows to 1
                        }                                // done in an increading order
                        start += value;
                    }
                }
            }
        }
    }
    public static void displayVal(int[][] array) // method to display movements represented by asterisks
    {
        for (int counter = 0; counter < array.length; counter++) // loops through row values of the board array
        {
            for (int coun = 0; coun < array[counter].length; coun ++) // loops through corresponding column values for each row
            {
                if (array[counter][coun] == 0) // prints a blank space if its value is zero
                    System.out.print(" ");
                else // prints an asterisk if otherwise, that is if it's a 1
                    System.out.print("*");
            }
            System.out.println(); // moves to a new line after processing each row
        }
    }
}