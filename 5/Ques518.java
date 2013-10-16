public class Ques518
{
   public static void main( String args[] )
   {
      int amount; // amount on deposit at end of each year
      int cents;
      int principal = 10000000; // initial amount before interest in pennies

      // display headers
      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

      // calculate amount on deposit for each of ten years
      for ( int year = 1; year <= 10; year++ ) 
      {
         // calculate new amount for specified year
         amount = (int)(principal * (Math.pow(1.05, year))); // amount after adding compound interest
         cents = amount % 10000; // cents
         // display the year and the amount
         System.out.printf( "%4d\t%d.%04d\n", year, amount/10000,cents ); // display amount after inserting period
      }
   }
}
