// I am Baadoo. Not one of those boys. @Madara, _where
import java.util.Scanner;
public class Ques228
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int radius; // radius of circle
        System.out.println("Radius >> ");
        radius = input.nextInt();
        
        System.out.printf("\nDiameter is %d\nCircumference is %f\nArea is %f", 
                          2*radius, 2*Math.PI*radius, Math.PI*radius*radius);
    }
}