public class Ques315Test
{
    public static void main(String[] args)
    {
        Ques315 test = new Ques315(28, 9, 1994); // creates a new object of Ques315 to test its capabilities
        System.out.printf("\nInitial date: ");
        test.displayDate(); // calls displayDate method of class Ques315
        test.setMonth(8); // modifying the value of month to 8
        test.setDay(3); // modifying the value of day to 3
        test.setYear(2013); // modifyint the value of year to 2013
        System.out.printf("\nNew date: ");
        test.displayDate(); // calls displayDate method of class Ques315
    }
}