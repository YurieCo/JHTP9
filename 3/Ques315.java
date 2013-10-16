public class Ques315
{
    int month; // variable representing month
    int day; // variable representing day
    int year; // variable representing year
    
    public Ques315(int monthVal, int dayVal, int yearVal) // constructor initializing the variables
    {
        month = monthVal;
        day = dayVal;
        year = yearVal;
    }
    public void setMonth(int monthValue) // set method for month
    {
        month = monthValue;
    }
    public void setDay(int dayValue) // set method for day
    {
        day = dayValue;
    }
    public void setYear(int yearValue) // set method for year
    {
        year = yearValue;
    }
    public int getMonth() // get method for month
    {
        return month;
    }
    public int getDay() // get method for day
    {
        return day;
    }
    public int getYear() // get method for year
    {
        return year;
    }
    public void displayDate()
    { // the variables could also be substituted by just their names, that is; month,day,year instead of the get methods
        System.out.printf("%d/%d/%d", getMonth(), getDay(), getYear());
    }
}