// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
import java.util.Random;
public class Ques718
{
   // create random number generator for use in method rollDice
   private static final Random randomNumbers = new Random(); 

   // enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST };

   // constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   public static void main( String[] args )
   {
       int keepTrack = 0; // to keep track of how many times game is won after twentieth roll
       int keepTrack2 = 0; // to keep track of how many times game is lost after twentieth roll
       int winChance = 0; // tally to keep track of the number of times game is won overall
       // variables to measure length of game
       int winLength = 0; // keep track of number of times the die rolls to seven or yo_leven
       int continueLength = 0;  // keep track of when game has to continue
       int loseLength = 0;  // keep track of number of times die rolls to snake_eyes, trey or box_cars
       
       for (int counter = 1; counter < 1000000; counter++)
       {
           int myPoint = 0; // point if no win or loss on first roll
           Status gameStatus; // can contain CONTINUE, WON or LOST
           
           int sumOfDice = rollDice(); // first roll of the dice
           
           // determine game status and point based on first roll 
           switch ( sumOfDice ) 
           {
               case SEVEN: // win with 7 on first roll
               case YO_LEVEN: // win with 11 on first roll           
                   gameStatus = Status.WON;
                   winLength++;
                   break;
               case SNAKE_EYES: // lose with 2 on first roll
               case TREY: // lose with 3 on first roll
               case BOX_CARS: // lose with 12 on first roll
                   gameStatus = Status.LOST;
                   loseLength++;
                   break;
               default: // did not win or lose, so remember point         
                   gameStatus = Status.CONTINUE; // game is not over
                   continueLength++;
                   myPoint = sumOfDice; // remember the point
                  /* System.out.printf( "Point is %d\n", myPoint ); */ // hide message
                   break; // optional at end of switch
           } // end switch 
           
           // while game is not complete
           while ( gameStatus == Status.CONTINUE ) // not WON or LOST
           { 
               sumOfDice = rollDice(); // roll dice again
               
               // determine game status
               if ( sumOfDice == myPoint ) // win by making point
                   gameStatus = Status.WON;
               else 
                   if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
                   gameStatus = Status.LOST;
           } // end while 
           
           //hide won or lost message
           /*if ( gameStatus == Status.WON )
            System.out.println( "Player wins" );
           else
               System.out.println( "Player loses" ); */
           if (gameStatus == Status.WON)
           {
               if (counter <= 20)
                   System.out.printf("\nGame won on %d roll", counter); // print if game is won in any of the first 20 rolls
               else
                   keepTrack++; // to increment variable, anytime game is won after the twentieth roll
               winChance++; // increment variable, each time a game is won
           }
           else
           {
               if (counter <= 20)
                   System.out.printf("\nGame lost on %d roll", counter); // print if game is lost in any of the first 20 rolls
               else
                   keepTrack2++; // to increment variable, anytime game is lost after the twentieth roll
           }
           
           // demonstating chances of winning as the length of game rises
           if (counter == 100000)
               System.out.printf("\n\nChances of winning (100000 games): %f",
                                 (double)winChance/100000);
           if (counter == 200000)
               System.out.printf("\nChances of winning (200000 games): %f",
                                 (double)winChance/200000);
           if (counter == 300000)
               System.out.printf("\nChances of winning (300000 games): %f",
                                 (double)winChance/300000);
           if (counter == 400000)
               System.out.printf("\nChances of winning (400000 games): %f",
                                 (double)winChance/400000);
           if (counter == 500000)
               System.out.printf("\nChances of winning (500000 games): %f",
                                 (double)winChance/500000);
           if (counter == 600000)
               System.out.printf("\nChances of winning (600000 games): %f",
                                 (double)winChance/600000);
           if (counter == 700000)
               System.out.printf("\nChances of winning (700000 games): %f",
                                 (double)winChance/700000);
           if (counter == 800000)
               System.out.printf("\nChances of winning (800000 games): %f",
                                 (double)winChance/800000);
           if (counter == 900000)
               System.out.printf("\nChances of winning (900000 games): %f",
                                 (double)winChance/900000);
       }
       System.out.printf("\n\n%s: %d times\n%s: %d times\n%s: %f",
                         "After the twentieth roll, Game is Won", keepTrack,
                         "After the twentieth roll, Game is Lost", keepTrack2,
                         "Overall chance of winning", (double)winChance/1000000);
       System.out.printf("\n\n%s:\n%s: %d\n%s: %d\n%s: %d",
                         "Average length of game", "Wins by throwing 7 or 11", winLength,
                         "Loses by throwing 2,3 or 12", loseLength, "Continues by throwing neither of these",
                         continueLength);
   } // end main
   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt( 6 ); // first die roll
      int die2 = 1 + randomNumbers.nextInt( 6 ); // second die roll

      int sum = die1 + die2; // sum of die values

      // hide results of this roll
      /*System.out.printf( "Player rolled %d + %d = %d\n", 
         die1, die2, sum );*/

      return sum; // return sum of dice
   }
}