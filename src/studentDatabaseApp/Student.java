package studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName = "";
    private String lastName = "";
    private int gradeYear;
    private String studentID = "";
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //constructor: prompt user to nter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name");
        this.lastName = in.nextLine();

        System.out.println("Enter student class level \n1 - for Freshmen \n2 for Sophmore \n3 Junior \n4 Senior: ");
        this.gradeYear = in.nextInt();


        setStudentId();
        System.out.println(firstName + " " + lastName + " Class: " + gradeYear + " Student ID: " + studentID);
    }


//Generate an id
    private void setStudentId() {
        //grade level + ID
        this.studentID = gradeYear + "" + id;
        id++;
    }
//enroll courses

    public void enroll() {


        System.out.print("Enter course to enroll or press Q to quit: ");
        Scanner in = new Scanner(System.in);

        while(true) {
            String course = in.nextLine();
            if(course.equals("Q")) {break;}
            courses = courses + "\n" + course;
            tuitionBalance += costOfCourse;

        }
            System.out.println("End of enrolling.");

        System.out.println("Enrolled in courses" + courses + "\n Tuition balance: $" + tuitionBalance);
    }


//view balance

    public void viewBalance() {
        System.out.println("Tuition balance: $" + tuitionBalance);

    }
//pay tuition
public void payTuition() {
    System.out.println("How much are you going to pay?");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
tuitionBalance -= payment;
    System.out.println("Thank you for the payment of: $");
    viewBalance();

}

//show status
    public String showInfo() {
        return "Name" + firstName + " " + lastName +
                "\nStudent ID is: " + studentID +
                "\nClass level is: " + gradeYear+
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;

    }
//
//

}