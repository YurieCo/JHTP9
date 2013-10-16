import java.util.Random;
public class TortandHare
{
    private static int tortPosition = 1;
    private static int harePosition = 1;
    private static Random generate = new Random();
    public static void main(String[] args)
    {
        int sentinel = 0;
        System.out.printf("\n%s\n%s\n", "BANG !!!!!", "AND THEY'RE OFF !!!!!");
        while (sentinel != -1)
        {
            race();
            if (tortPosition <= harePosition)
            {
                for (int count = 0; count < tortPosition; count++)
                    System.out.print(" ");
                if (tortPosition == harePosition)
                    System.out.println("OUCH!!!");
                else
                {
                    System.out.print("T");
                    for (int count = tortPosition; count < harePosition; count++)
                        System.out.print(" ");
                    System.out.println("H");
                }
            }
            else
            {
                for (int count = 0; count < harePosition; count++)
                    System.out.print(" ");
                System.out.print("H");
                for (int count = harePosition; count < tortPosition; count++)
                    System.out.print(" ");
                System.out.println("T");
            }
            // test for win / tie condition
            if (tortPosition >= 70 && harePosition >= 70)
            {
                System.out.println("It's a tie");
                sentinel = -1;
            }
            if (tortPosition >= 70)
            {
                System.out.println("TORTOISE WINS!!!YAY!!!");
                sentinel = -1;
            }
            if (harePosition >= 70)
            {
                System.out.println("Hare wins. Yuch");
                sentinel = -1;
            }
        }
    }
    public static void race()
    {
        int i = 1 + generate.nextInt(10);
        // tortoise's movement
        switch(i)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: 
                tortPosition += 3;
                break;
            case 6:
            case 7:
                tortPosition -= 6;
                if (tortPosition < 1)
                    tortPosition = 1;
                break;
            case 8:
            case 9: 
            case 10:
                tortPosition += 1;
                break;
            default:
                break;
        }
        //hare's movement
        switch(i)
        {
            case 1:
            case 2:
                harePosition += 0;
                break;
            case 3:
            case 4:
                harePosition += 9;
                break;
            case 5:
                harePosition -= 12;
                if (harePosition < 1)
                    harePosition = 1;
                break;
            case 6:
            case 7:
            case 8:
                harePosition += 1;
                break;
            case 9:
            case 10:
                harePosition -= 2;
                if (harePosition < 1)
                    harePosition = 1;
                break;
        }
    }
} 