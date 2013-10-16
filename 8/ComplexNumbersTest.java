public class ComplexNumbersTest
{
    public static void main(String[] args)
    {
        Complex t = new Complex(6,3);
        Complex v = new Complex(3,5);
        System.out.println(Complex.print(Complex.subtract(t,v)));
    }
}