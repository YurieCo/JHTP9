// I am Baadoo. Not one of those boys! @Madara, _where
import java.util.Scanner;
public class Ques311Test
{
    public static void main(String[] args)
    {
        Ques311 test = new Ques311("Econometrics", "Dr Hassan");
        test.displayMessage();
    }
}

class Ques311
{
   private String courseName; // course name for this GradeBook
   private String courseInstructor; // course instructor name for this GradeBook

   // constructor initializes courseName and courseInstructor with String argument
   public Ques311( String name, String instruct )
   {
      courseInstructor = instruct; // initializes instructor's name
      courseName = name; // initializes courseName
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName
   // method to set the instructor's name
   public void setInstructorName (String name)
   {
       courseInstructor = name; // store the instructor's name
   }
   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName
   // method to retrieve the instructor's name
   public String getCourseInstructor()
   {
       return courseInstructor;
   }
   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      System.out.printf( "Welcome to the grade book for\n%s!\nThis course is presented by: %s", 
         getCourseName(), getCourseInstructor() );
   }
} 
