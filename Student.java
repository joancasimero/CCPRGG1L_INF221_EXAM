public class Student {

    String surname;
    String firstName;
    String middleInitial;
    int dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMyStudentNumber() {
        System.out.println("My Student Number is " + studentNumber);
    }

    public void sayMystudentEmailAddress() {
        System.out.println("My Student Email Address is " + studentEmailAddress);
    }

    public void AmIAwesome() {
        System.out.println("Yes you are Joan!");
    }

}
