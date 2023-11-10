public class GoodStudent
{
    private String firstName;
    private String lastName;
    public String nickname;
    private int idNumber;
    private double gpa;
    private boolean csStudent = true;

    public GoodStudent()
    {
        firstName = "";
        lastName = "";
        nickname = "";
        idNumber = 0;
        gpa = 0;
        csStudent = true;
    } // end default constructor
        public GoodStudent(String studentFirstName, String studentLastName, int studentIDNumber, double studentGPA, boolean isCSStudent)
        {
            firstName = studentFirstName;
            lastName = studentLastName;
            nickname = "";
            idNumber = studentIDNumber;
            gpa = studentGPA;
            csStudent = isCSStudent;
    } //  end constructor
    public GoodStudent(String studentFirstName, String studentLastName, String studentNickname, int studentIDNumber, double studentGPA, boolean isCSStudent)
    {
        firstName = studentFirstName;
        lastName = studentLastName;
        nickname = studentNickname;
        idNumber = studentIDNumber;
        gpa = studentGPA;
        csStudent = isCSStudent;
    } // end full constructor

    // accessors
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getNickname()
    {
        return nickname;
    }
    public int getIDNumber()
    {
        return idNumber;
    }
    public double getGPA()
    {
        return gpa;
    }
    public boolean getCSStudent()
    {
        return csStudent;
    }
    // end accessors
    // mutator
    public void setGPA(double studentGPA)
    {
        gpa = studentGPA;
    }
    public void setNickname(String studentNickname)
    {
        nickname = studentNickname;
    } // end mutator
    // brain methods
    public String CreateID()
    {
        String id = firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase() + String.valueOf(idNumber).substring(2);
        return id;
    }
    public double CSGPA()
    {
        if (csStudent)
        {
            return gpa * 1.15;
        }
        else
        {
            return gpa;
        }
    } // end brain methods
    public String toString()
    {
        String result = "\nStudent name: " + firstName + " " + lastName ;
        result += "\nNickname: " + nickname +
                "\nID Number: " + idNumber +
                "\nGPA: " + gpa +
                "\nCS Student: " + csStudent;

        return result;
    }
} // end class GoodStudent



