public class Ques314
{
    String firstName; // variable for first name
    String lastName; // variable for last name
    double salary; // variable for monthly salary
    
    public Ques314 (String fName, String lName, double mSal) // constructor
    {
        firstName = fName; 
        lastName = lName;
        salary = mSal;
    }
    public void setFirstName(String first) // set first name
    {
        firstName = first;
    }
    public void setLastName(String last) // set last name
    {
        lastName = last;
    }
    public void setSalary(double sal) // set salary
    {
        if (sal > 0)
            salary = sal;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getSalary()
    {
        return salary;
    }
    
}