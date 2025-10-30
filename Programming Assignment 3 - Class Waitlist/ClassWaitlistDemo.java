import java.util.Scanner;

/**
 * @author Christopher Bergsveinsson
 * @version 10/30/2025
 * CSC 223
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 3 - Queue ADT for class waitlist - ClassWaitlistDemo
 */

public class ClassWaitlistDemo {
    public static void main(String[] args) {

        int option;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the maximum amount of students you would like to have in this waitlist: ");
        ClassWaitlist CSClassWaitlist = new ClassWaitlist(keyboard.nextInt()); // computer science class waitlist of user-decided size


        do {
            System.out.println("""
                    \nEnter 1 to add a student
                    Enter 2 to remove a student
                    Enter 3 to see everyone on the waitlist in order
                    Enter 4 to get the size of the waitlist
                    Enter 5 to exit the program""");

            option = keyboard.nextInt();

            String studentName; // variables to keep track of Student details
            int studentID;

            if (option == 1) { // option for entering student info

                System.out.println("\nEnter student name: ");
                keyboard.nextLine();
                studentName = keyboard.nextLine();

                System.out.println("Enter student ID: ");
                studentID = keyboard.nextInt();

                try {
                    CSClassWaitlist.enqueue(new Student(studentName, studentID));
                    System.out.println("\nStudent added to waitlist");
                } catch (QueueFullException e) {
                    System.out.println("\n" + e.getMessage());
                }

            } else if (option == 2) { // option to remove a student from the waitlist

                try {
                    System.out.println("\nStudent: " + CSClassWaitlist.dequeue() + " removed");
                }
                catch (QueueEmptyException e) {
                    System.out.println("\n" + e.getMessage());
                }

            } else if (option == 3) { // option to return the students in the waitlist in order

                if(CSClassWaitlist.size() > 0) {
                    System.out.println("\nTop of waitlist to bottom:\n" + CSClassWaitlist);
                }
                else {
                    System.out.println("\nWaitlist is empty");
                }

            } else if (option == 4) { // option to return the size of the waitlist

                System.out.println("\nThe amount of students in this waitlist is " + CSClassWaitlist.size() + " student(s)");

            } else if (option == 5) { // option for exiting waitlist

                System.out.println("\nGoodbye!");

            }
            else {
                System.out.println("\nError!");
            }
        }
        while(option != 5); {
        }

    }
}
