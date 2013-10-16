public class Ques313Test
{
    public static void main(String[] args)
    { // a test object of Ques313 initialized with part number 004, a part description, quantity 4 and price 10
        Ques313 test = new Ques313("004", "A test object of class Ques313", 4, 10);
        System.out.printf("\nBefore changing values, \n%s: %s\n%s: %s\n%s: %d\n%s: %d\n%s: %f\n", 
                          "Part number", test.getNumber(), "Part Description", test.getDescription(),
                          "Quantity", test.getQuantity(), "Price", test.getPrice(), "Invoice amount",
                          test.getInvoiceAmount());
        test.setNumber("005"); // setting the value of the part number to 005
        test.setDescription("A modified part description"); // modifying the part description
        test.setQuantity(30); // setting the quantity to 30
        test.setPrice(100); // setting the price to 100
        System.out.printf("\nAfter changing values, \n%s: %s\n%s: %s\n%s: %d\n%s: %d\n%s: %f\n", 
                          "Part number", test.getNumber(), "Part Description", test.getDescription(),
                          "Quantity", test.getQuantity(), "Price", test.getPrice(), "Invoice amount",
                          test.getInvoiceAmount());
        
    }
}