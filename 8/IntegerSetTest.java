public class IntegerSetTest
{
    public static void main(String[] args)
    {
        IntegerSet one = new IntegerSet(1,4,3,5,2,21);
        IntegerSet two = new IntegerSet(4,3,1,21);
        IntegerSet three = IntegerSet.intersection(one,two);
        three.deleteElement(21);
        System.out.println(three);
    }
}