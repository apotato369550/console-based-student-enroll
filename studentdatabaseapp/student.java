package studentdatabaseapp;
import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String studentId;
    private String courses = "";
    private int balance;
    private static int coursePrice = 600;
    private static int id = 1000;

    // Prompt user to enter first name and last name
     public void student(){
        Scanner in = new Scanner(System.in);
        // get first name
        System.out.println("PLEASE ENTER STUDENT'S FIRST NAME: \n");
        this.firstName = in.nextLine();
        //get last name
        System.out.println("PLEASE ENTER STUDENT'S LAST NAME: \n");
        this.lastName = in.nextLine();
        //get grade level
        System.out.println("PLEASE ENTER STUDENT'S YEAR LEVEL: \n 1 FOR FRESHMAN \n 2 FOR SOPHOMORE \n 3 FOR JUNIOR \n 4 FOR SENIOR \n");
        this.gradeLevel = in.nextInt();

        this.studentId = setStudentId();
        //enroll student
         enroll();
         payBalance();
    }
    // Generate random 5-digit id number
    private String setStudentId(){
         //Incriment id no. (static variable)
         id ++;
         // Grade level no. + current id student number
         return this.gradeLevel + "" + id;
    }
    // Enroll in Different Courses
    public void enroll(){

        System.out.println("ENROLL TO COURSES: (Q TO QUIT) ");
        do {
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses += "\n -" + course;
                balance += coursePrice;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("TUITION BALANCE: " + balance);
    }
    // show tuition balance
    public void viewBalance(){
         System.out.println("YOUR BALANCE IS: $" + balance);
    }
    // pay Tuition Balance
    public void payBalance(){
         viewBalance();
         Scanner in = new Scanner(System.in);
         System.out.println("ENTER PAYMENT AMOUNT: ");
         int payment = in.nextInt();
         balance -= payment;
         System.out.println("THANK YOU FOR YOUR PAYMENT OF: $" + payment);
         viewBalance();
    }
    // Show Status
    public String showInfo(){
         return "\n\n\n\nNAME:" + firstName + " " + lastName + "\n" +
                "YEAR LEVEL: " + gradeLevel + "\n" +
                "ID NUMBER: " + studentId + "\n" +
                "COURSES ENROLLED: " + courses + "\n" +
                "CURRENT BALANCE: " + balance + "\n" +
                "THANK YOU FOR ENROLLING TO UNOUNOUNI UNIVERSITY";

    }
}
