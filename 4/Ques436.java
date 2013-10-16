import java.util.Scanner;
public class Ques436
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side >> ");
        int side1 = input.nextInt();
        System.out.print("Enter second side >> ");
        int side2 = input.nextInt();
        System.out.print("Enter third side >> ");
        int side3 = input.nextInt();
        int a = side1*side1;
        int b = side2*side2;
        int c = side3*side3;
        
        if (a == (b + c))
            System.out.print("The sides could represent that of a right angle");
        else if (b == (a + c))
            System.out.print("The sides could represent that of a right angle");
        else if (c == (a + b))
            System.out.print("The sides could represent that of a right angle");
        else 
            System.out.print("The sides cannot represent the sides of a right angle");
    }
}