// Fig. 7.2: InitArray.java
// Initializing the elements of an array to default values of zero.

public class Ques715 
{
   public static void main( String[] args )
   {
      int[] array; // declare array named array
      if (args.length != 0)  // create the array object if an argument is passed
          array = new int[Integer.parseInt(args[0])]; // call parseInt method to convert String to integer
      else
          array = new int[10];
      
      System.out.printf( "%s%8s\n", "Index", "Value" );
      
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%5d%8d\n", counter, array[ counter ] );
   }
}