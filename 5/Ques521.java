public class Ques521
{
    public static void main(String[] args)
    {
        int side1; // first side
        int side2; // second side
        int hypotenuse; // hypotenuse
        
        System.out.printf("\n%s\t%s\t%s", "Side1", "Side2", "Hypotenuse"); // headers
        for (side1 = 1; side1 <= 500; side1++)
        { // loop through possibilities
            for (side2 = 1; side2 <= 500; side2++)
            { // loop through possibilities
                for (hypotenuse = 1; hypotenuse <= 500; hypotenuse++)
                { // loop through possibilities
                    int dis = (side1 * side1) + (side2 * side2); // test condition for satisfaction of relationship
                    int dis1 = (hypotenuse * hypotenuse); // test condition for satisfaction of relationship
                    
                    if (dis == dis1) // if condition is satisfied
                        System.out.printf("\n%s\t%s\t%s", side1, side2, hypotenuse); // print values
                }
            }
        }
    }
}