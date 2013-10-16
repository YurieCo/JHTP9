public class Ques432
{
    public static void main(String[] args)
    {
        int count;
        int count1;
        int count2 = 0;
        while (count2 < 3)
        {
            count = 0;
            count1 = 0;
            while (count < 8)
            {
                System.out.print("* ");
                count ++;
            }
            System.out.println();
            System.out.print(" ");
            while (count1 < 7)
            {
                System.out.print("* ");
                count1++;
            }
            System.out.println();
            count2++;
        }
    }
}