import java.util.Scanner;

/**
 * @author Christopher Bergsveinsson
 * @version 9/23/2025
 * CSC 223 
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 1 - Stack ADT program for Computer Science enrollment - Demo Class
 */

public class Demo
{
    public static void main(String [] args) {

        FacultyStack FacultyStack = new FacultyStack(); // faculty stack class object

        boolean exit = false; // variables to keep track of user input
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("\n\u001B[32mHello, welcome to the Computer Science department's professor management system!");

        while(!exit) {

            // ANSI Escape codes are utilized to color code text for more readability
            System.out.println("\u001B[32m\nWhat would you like to do?\n1. Add a professor\n2. Look at the newest professor\n3. Delete the newest professor\n4. Search for a professor\n5. View the professors from newest to oldest or\n6. Oldest to newest\n7. Exit\u001B[31m");
            option = sc.nextInt();

            switch(option) {

                case 1: // Adding a professor
                    System.out.println("\nList the professor's name, ID and department separated by the enter key.");
                    sc.nextLine();

                    String profName = sc.nextLine();
                    System.out.println("Name noted");

                    int profID = sc.nextInt();
                    System.out.println("ID noted");
                    sc.nextLine();

                    String profDept = sc.nextLine();
                    System.out.println("Department noted");

                    FacultyStack.push(new Faculty(profName, profID, profDept)); // combines variables from input to create a Faculty object
                    System.out.println("Professor added to the list.");
                    break;

                case 2: // Uses peek to show the newest professor in the stack
                    System.out.println("\nThe newest professor is:\n" + FacultyStack.peek() + "\n");
                    break;

                case 3: // Uses pop to remove the newest professor from the stack
                    FacultyStack.pop();
                    System.out.println("\nThe newest professor has been removed.");
                    break;

                case 4: // Uses similar code to the first case to search for a professor using Faculty's equals() method.
                    System.out.println("\nList the professor's name, ID and department separated by the enter key.");
                    sc.nextLine();

                    String profName2 = sc.nextLine();
                    System.out.println("Name taken");

                    int profID2 = sc.nextInt();
                    System.out.println("ID taken");
                    sc.nextLine();

                    String profDept2 = sc.nextLine();
                    System.out.println("Department taken");

                    int profPos = FacultyStack.search(new Faculty(profName2, profID2, profDept2)); // combines variables from input to create a Faculty object, so it can be compared to members of the stack, and returns position if found
                    if(profPos != -1) {
                        System.out.println("\nProfessor found at position " + profPos + " of seniority (position 0 is the first professor hired).");
                    }
                    else {
                        System.out.println("\nProfessor not found.");
                    }
                    break;

                case 5: // uses toString to print out the professors from newest to oldest
                    System.out.println("\nThe professors newest to oldest are:");
                    System.out.println(FacultyStack);
                    break;

                case 6: // uses toString2 to print out the professors from oldest to newest
                    System.out.println("\nThe professors oldest to newest are:");
                    System.out.println(FacultyStack.toString2());
                    break;

                case 7: // changes boolean variable exit to true to stop the program
                    System.out.println("\u001B[34mGoodbye!");
                    exit = true;
                    break;

            }


        }
    }
}

