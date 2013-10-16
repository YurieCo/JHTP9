public class Ques316
{
    String firstName;
    String lastName;
    int month;
    int day;
    int year;
    int age; // variable representing age in years
    int maxHeartRate; // variable representing maximum heart rate
    String targetRange; // variable representing the target heart rate
    
    public Ques316(String fName, String lName, int cMonth, int cDay, int cYear) // constructor method
    {
        firstName = fName;
        lastName = lName;
        month = cMonth;
        day = cDay;
        year = cYear;
    }
    public void setFirstName(String first) // mehod to set first name
    {
        firstName = first;
    }
    public void setLastName(String last) // method to set last name
    {
        lastName = last;
    }
    public void setMonth(int monthVal) // method to set month
    {
        month = monthVal;
    }
    public void setDay(int dayVal) // method to set day
    {
        day = dayVal;
    }
    public void setYear(int yearVal) // method to set year
    {
        year = yearVal;
    }
    public String getFirstName() // method to get first name
    {
        return firstName;
    }
    public String getLastName() // method to get last name
    {
        return lastName;
    }
    public int getMonth() // method to get month
    {
        return month;
    }
    public int getDay() // method to get day
    {
        return day;
    }
    public int getYear() // method to get year
    {
        return year;
    }
    public int ageYear() // method to calculate age
    {
        age = (2013-getYear()); // subtracts year of birth from current year, 2013
        return age;
    }
    public int maximumHeartRate() // method to calculate the maximum heart rate
    {
        maxHeartRate = 220 - age;
        return maxHeartRate;
    }
    public String targetHeartRate() // method to calculate the target heart rate
    {
        double start = (double)50/100 * maxHeartRate; // variable representing the start point of the target range
        double end = (double)85/100 * maxHeartRate; // variable representing the end point of the target range
        targetRange = start + " - " + end;
        return targetRange;
    }
}