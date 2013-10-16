public class Ques317
{ 
    String firstName;
    String lastName;
    String gender;
    int month;
    int day;
    int year;
    int height;
    int weight;
    int age; // variable representing age in years
    int maxHeartRate; // variable representing maximum heart rate
    String targetRange; // variable representing the target heart rate
    
    public Ques317(String fName,String lName,String gen,int mVal,int dVal, int yVal, int hVal, int wVal) // constructor
    {
        firstName = fName;
        lastName = lName;
        gender = gen;
        month = mVal;
        day = dVal;
        year = yVal;
        height = hVal;
        weight = wVal;
    }
    // set methods for the variables
    public void setFirstName(String fName)
    {
        firstName = fName;
    }
    public void setLastName(String lName)
    {
        lastName = lName;
    }
    public void setGender(String gen)
    {
        gender = gen;
    }
    public void setMonth(int mVal)
    {
        month = mVal;
    }
    public void setDay(int dVal)
    {
        day = dVal;
    }
    public void setYear(int yVal)
    {
        year = yVal;
    }
    public void setHeight(int hVal)
    {
        height = hVal;
    }
    public void setWeight(int wVal)
    {
        weight = wVal;
    }
    // get methods for the variables
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getGender()
    {
        return gender;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }
    public int getHeight()
    {
        return height;
    }
    public int getWeight()
    {
        return weight;
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
    public double bodyMassIndex() // method to calculate the body mass index
    {
        return (weight * 703) / (height*height);
        
    }
}