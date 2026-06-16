import java.util.Scanner;

/**
 * @author Christopher Bergsveinsson
 * @version 12/4/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 6 - Course Tracker with NodeBasedList - Main
 */

public class Main {
    public static void main(String[] args) {

        NodeBasedList<Course> coursesTaken = new NodeBasedList<>();
        NodeBasedList<Course> coursesRequired = new NodeBasedList<>();

        int option;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("""
                    \nEnter 1 to add a course to your taken or required courses
                    Enter 2 to remove a course from your taken or required courses
                    Enter 3 to view the courses, you've taken, are required, or you haven't taken yet that are required
                    Enter 4 to exit the program""");

            option = keyboard.nextInt();

            if (option == 1) {

                System.out.println("Enter course abbreviation: ");
                keyboard.nextLine();
                String courseAbbreviation = keyboard.nextLine();

                System.out.println("Enter course number: ");
                int courseNumber = keyboard.nextInt();

                System.out.println("Enter course name:");
                keyboard.nextLine();
                String courseName = keyboard.nextLine();

                System.out.println("Is this a class you've taken (1) or is required (2)");
                option = keyboard.nextInt();
                if (option == 1) {

                    System.out.println("Enter semester you took this course:");
                    keyboard.nextLine();
                    String semesterTook = keyboard.nextLine();

                    System.out.println("Enter the grade you received:");
                    String courseGrade = keyboard.nextLine();

                    coursesTaken.add(new Course(courseAbbreviation, courseNumber, courseName,  semesterTook, courseGrade));
                    System.out.println("Taken course added successfully!");
                }
                else if (option == 2) {
                    coursesRequired.add(new Course(courseAbbreviation, courseNumber, courseName));
                    System.out.println("Required course added successfully!");
                }


            } else if (option == 2) {

                System.out.println("Enter course abbreviation: ");
                keyboard.nextLine();
                String courseAbbreviation = keyboard.nextLine();

                System.out.println("Enter course number: ");
                int courseNumber = keyboard.nextInt();

                System.out.println("Enter course name:");
                keyboard.nextLine();
                String courseName = keyboard.nextLine();

                System.out.println("Is this a class you've taken (1) or is required (2)");
                option = keyboard.nextInt();

                if (option == 1) {
                    if(coursesTaken.remove(new Course(courseAbbreviation, courseNumber, courseName))) {
                        System.out.println("Taken course removed successfully!");
                    }
                    else {
                        System.out.println("There is no such course!");
                    }
                }
                else if (option == 2) {
                    if(coursesRequired.remove(new Course(courseAbbreviation, courseNumber, courseName))) {
                        System.out.println("Required course removed successfully!");
                    }
                    else {
                        System.out.println("There is no such course!");
                    }
                }

            } else if (option == 3) {
                System.out.println("Enter your choice (1, 2 or 3)");
                option  = keyboard.nextInt();

                if (option == 1) {
                    System.out.println("Courses taken:\n" + coursesTaken);
                }
                else if (option == 2) {
                    System.out.println("Courses required:\n" + coursesRequired);
                }
                else if(option == 3) {
                    System.out.println("Courses remaining:\n" + coursesRequired.difference(coursesTaken));
                }
                else {
                    System.out.println("Invalid input!");
                }

            }
            else {
                System.out.println("Invalid option");
            }
        }
        while(option != 5); {
        }

    }
}