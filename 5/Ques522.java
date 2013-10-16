public class Ques522
{
    public static void main(String[] args)
    {
        // loop to print first triangle
        for(int count = 1; count <= 10; count++)
        {
            for (int c = 1; c <= count; c++)
                System.out.print("*");
            for (int c = 10; c > count; c--)
                System.out.print(" ");
            System.out.print("\t");
            for (int c = 10; c > count-1; c--)
                System.out.print("*");
            for (int c = count; c > 1; c--)
                System.out.print(" ");
            System.out.print("\t");
            for (int c = count; c > 1; c--)
                System.out.print(" ");
            for (int c = 10; c > count-1; c--)
                System.out.print("*");
            System.out.print("\t");
            for (int c = 10; c > count; c--)
                System.out.print(" ");
            for (int c = 1; c <= count; c++)
                System.out.print("*");
            System.out.println();
        }
        
        /*// loop to print second triangle
        for (int count = 10; count >= 1; count--)
        {
            for (int c = 1; c <= count; c++)
            {
               System.out.print("*"); 
            }
            System.out.println();
        }
        System.out.println();
        
        // loop to print third triangle
        for (int count = 0; count < 10; count++)
        {
            for (int c = 1; c <= count; c++)
            {
                System.out.print(" ");
            }
            for (int c = 0; c <= (9 - count); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        // loop to print fourth triangle
        for (int count = 9; count >= 0; count--)
        {
            for (int c = 1; c <= count; c++)
            {
                System.out.print(" ");
            }
            for (int c = 0; c <= (9 - count); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }
}