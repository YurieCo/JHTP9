import java.util.Scanner;
public class Ques517
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // new Scanner object - input
        int productNum = 0; // product number variable initialized to zero
        int quantity; // quantity purchased
        double retailPrice = 0; // retail price
        
        while (productNum != -5) 
        { // sentinel controlled loop until user enters -5 as product number
            System.out.print("Product number >> ");
            productNum = input.nextInt();
            System.out.print("Quantity sold >> ");
            quantity = input.nextInt();
            
            switch(productNum)
            { // switch statement that compares the value for productNum to cases
                case 1:
                    retailPrice += 2.98*quantity; // increment retailPrice using product one's price
                    break;
                case 2:
                    retailPrice += 4.5*quantity; // increment retailPrice using product two's price
                    break;
                case 3:
                    retailPrice += 9.98*quantity; // increment retailPrice using product three's price
                    break;
                case 4:
                    retailPrice += 4.49*quantity; // increment retailPrice using product four's price
                    break;
                case 5: 
                    retailPrice += 6.87*quantity; // increment retailPrice using product five's price
                    break;
                default:
                    break; 
            }
        }
        System.out.printf("\nTotal retail value: %f", retailPrice);
    }
}