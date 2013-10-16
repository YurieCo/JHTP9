public class Ques514 
{
   public static void main( String args[] )
   {
      double amount; // amount on deposit at end of each year
      double principal; // initial amount before interest 
      
      // calculate amount on deposit for each of ten years
      for (int rate = 5; rate <= 10; rate++) // loop through interest rates 5 to 10
      {
          System.out.printf("Compound rate for %d percent:\n", rate);
          amount = 0; // initialize amount to 0
          principal = 1000; // initialize principal to 1000
          System.out.printf( "%s%20s\n", "Year", "Amount on deposit" ); // print headers
          for ( int year = 1; year <= 10; year++ ) // loop through years from 1 to 10
          {
              // calculate new amount for specified year
              amount = principal * Math.pow((1.0 + (double)rate/100), year );
              // display the year and the amount
              System.out.printf( "%4d%,20.2f\n", year, amount );
          }
          System.out.println();
      }
   }
}