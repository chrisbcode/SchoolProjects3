import java.util.Scanner;

/**
 * @author Christopher Bergsveinsson
 * @version 9/25/2025
 * CSC 223 
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Practice Test - ImprovedStackProgram - Demo Class
 */

public class ImprovedStackDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ImprovedStack<String> myImprovedStack = new ImprovedArrayBasedStack<>(6);

        int option;
        do {
            System.out.println("""
                    Press 1 to push one item onto the stack
                    Press 2 to push two items onto the stack
                    Press 3 to pop the top of stack
                    Press 4 to pop the top of the stack twice
                    Press 5 to look at the top of the stack
                    Press 6 to end the program""");
            option = keyboard.nextInt();
            String item1;
            String item2;

            if(option == 1) {
                System.out.println("What would you like to push to the stack?");
                keyboard.nextLine();
                item1 = keyboard.nextLine();
                try {
                    myImprovedStack.push(item1);
                } catch (StackFullException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(option == 2) {
                System.out.println("What would you like to push to the stack?");
                keyboard.nextLine();
                item1 = keyboard.nextLine();
                try {
                    myImprovedStack.push(item1);
                }
                catch(StackFullException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("What would you like to push to the stack?");
                item2 = keyboard.nextLine();
                try {
                    myImprovedStack.push(item2);
                }
                catch(StackFullException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(option == 3) {
                try {
                    myImprovedStack.pop();
                }
                catch(StackFullException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(option == 4) {
                try {
                    myImprovedStack.doublePop();
                }
                catch(StackFullException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(option == 5) {
                try {
                    System.out.println(myImprovedStack.top());
                }
                catch(StackFullException e) {
                    System.out.println(e.getMessage());
                }
            }
            else if(option == 6) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Error!");
            }
        }
        while(option != 6); {

        }
    }
    }
