public class GoodStudentDriver
{
    public static void main(String[] args)
    {
        GoodStudent alanTuring = new GoodStudent("Alan", "Turing", "Big Al", 191254, 3.56, true);
        GoodStudent florenceNightingale = new GoodStudent("Florence", "Nightingale", 182010, 3.89, false);
        GoodStudent graceHopper = new GoodStudent("Grace", "Hopper", "Queen Bee", 190692, 3.99, true);

        System.out.println(alanTuring.toString() + "\nStudent ID: " + alanTuring.CreateID() + "\nCS GPA: " + alanTuring.CSGPA() + "\n" +
                            "\n---------------------------------------------------------\n");

        florenceNightingale.setNickname("Flo-No");
        florenceNightingale.setGPA(3.92);
        System.out.println("Florence Nightingale Nickname: " + florenceNightingale.getNickname() + "\nStudent ID: " + florenceNightingale.CreateID() +
                            "\nGPA: " + florenceNightingale.getGPA() + "\n---------------------------------------------------------\n");

        System.out.println("First Name: " + graceHopper.getFirstName() + "\nStudent ID: " + graceHopper.CreateID() + "\nCS Student: " +
                            graceHopper.getCSStudent() + "\nCS GPA: " + graceHopper.CSGPA());
    } // end method main
} // end class Main

