public class Ques720
{
    private static int[][] sales = new int[5][4];
    private static int[] totals = new int[10];
    public static void main(String[] args)
    {
        processSales(new int[]{4,2,10}, new int[]{2,2,15}, new int[]{1,4,40},
                     new int[]{1,2,20}, new int[]{1,3,50}, new int[]{1,5,60},
                     new int[]{1,1,50}, new int[]{2,1,20}, new int[]{2,3,65},
                     new int[]{2,4,30}, new int[]{2,5,25}); // arrays of sales slips passed to method processSales

        // to total each row
        for (int counter = 0; counter < 5; counter++)
        {
            for (int c = 0; c < 4; c++)
                totals[counter] += sales[counter][c];  // total each row and assign it to totals' elements between 0 and 4 inclusive
        }
        for (int counter = 0; counter < 4; counter++)
        {
            for (int c = 0; c < 5; c++)
                totals[counter+5] += sales[c][counter]; // total each column and assign it to totals' elements between 5 and 8
        }
        for (int count = 0; count < 5; count++)
            totals[9] += totals[count];  // get total value of totals row/column
        displayTable(); // method to print out table
    }
    // assign corresponding elements of the sales slips to their appropriate positions
    public static void processSales(int[]... slip)
    {
        for(int[] salesInfo : slip)                                  // the method loops through each array passed in 
            sales[salesInfo[1]-1][salesInfo[0]-1] = salesInfo[2];    // and assigns the dollar value of sales to the 
    }                                                                // appropriate columns(sales person)/rows(product number) in the table
    public static void displayTable()
    {
        System.out.printf("%9s\t%9s%9s%9s%9s%9s", " ","SalesP 1", "SalesP 2",
                          "SalesP 3", "SalesP 4", "Totals"); // Headers for columns
        for (int counter = 0; counter < 5; counter++)
        {
            System.out.printf("\n%s%d\t", "Product ", counter+1);
            for (int c = 0; c < 4; c++)
                System.out.printf("%9d", sales[counter][c]);
            System.out.printf("%9d\n", totals[counter]);
        }
        System.out.printf("\n%9s\t", "Totals");
        for (int count = 0; count < 4; count++)
            System.out.printf("%9d", totals[5+count]);
        System.out.printf("%9d", totals[9]);
    }
}