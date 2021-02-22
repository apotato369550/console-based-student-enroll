package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        // Ask how many users needed to be added
        System.out.println("PLEASE ENTER NUMBER OF STUDENTS:" );
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

        // Create n amount of students/users
        for(int i = 0; i < numOfStudents; i ++){
            students[i] = new student();
            students[i].student();
        }
        for(int i = 0; i < numOfStudents; i ++){
            System.out.println(students[i].showInfo());
        }
    }
}
