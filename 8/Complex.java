public class Complex
{
    private double realPart;
    private double imaginaryPart;
    public Complex()
    {
        realPart = 0;
        imaginaryPart = 0;
    }
    public Complex(double real, double imaginary)
    {
        realPart = real;
        imaginaryPart = imaginary;
    }
    public double getRealPart()
    {
        return realPart;
    }
    public double getImaginaryPart()
    {
        return imaginaryPart;
    }
    public void setRealPart(double real)
    {
        realPart = real;
    }
    public void setImaginaryPart(double imagine)
    {
        imaginaryPart = imagine;
    }
    public static Complex add(Complex one, Complex two)
    {
        return new Complex((one.getRealPart() + two.getRealPart()), (one.getImaginaryPart() + two.getImaginaryPart()));
    }
    public static Complex subtract(Complex one, Complex two)
    {
        return new Complex((two.getRealPart() - one.getRealPart()), (two.getImaginaryPart() - one.getImaginaryPart()));
    }
    public static String print(Complex one)
    {
        return String.format(""+one.getRealPart()+", "+one.getImaginaryPart());
    }
}