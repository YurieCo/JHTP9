public class Ques314Test
{
    public static void main(String[] args)
    {
        Ques314 test1 = new Ques314("Employee1", "One", 400.0);
        Ques314 test2 = new Ques314("Employee2", "Two", 500.0);
        
        System.out.printf("\nYearly salary for %s: %f\nYearly salary for %s: %f",
                          test1.getFirstName(), test1.getSalary()*12, 
                          test2.getFirstName(), test2.getSalary()*12);
        test1.setSalary(test1.getSalary() * 110/100);
        test2.setSalary(test2.getSalary() * 110/100);
        System.out.printf("\nYearly salary for %s after raise: %f\nYearly salary for %s: %f",
                          test1.getFirstName(), test1.getSalary()*12, 
                          test2.getFirstName(), test2.getSalary()*12);
    }
}