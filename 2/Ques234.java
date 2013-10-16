// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner;
public class Ques234
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int wpop; // variable to store current world population
        int grow; // variable to store current growth rate
        int pop; // population after growth
        System.out.println("Current world population >> ");
        wpop = input.nextInt();
        pop = wpop; // set initial after-growth population to initial current population
        System.out.println("Current growth rate >> "); // should be entered raw e.g 0.2 for 20%
        grow = input.nextInt();
        
        pop = pop + (grow * pop) / 100; // after growth population
        System.out.printf("\nPopulation after one year:     %d", pop);
        pop = pop + (grow * pop) / 100; // after growth population
        System.out.printf("\nPopulation after two years:    %d", pop);
        pop = pop + (grow * pop) / 100; // after growth population
        System.out.printf("\nPopulation after three years:  %d", pop);
        pop = pop + (grow * pop) / 100; // after growth population
        System.out.printf("\nPopulation after four years:   %d", pop);
        pop = pop + (grow * pop) / 100; // after growth population
        System.out.printf("\nPopulation after five years:   %d", pop);
    }
}