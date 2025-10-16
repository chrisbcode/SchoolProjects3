/**
 * @author Christopher Bergsveinsson
 * @version 10/15/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - CDStackDemo
 */

import java.util.Objects;
import java.util.Scanner;

public class CDStackDemo {
    public static void main(String[] args) {

        NodeBasedStack nonEnglishCDs = new NodeBasedStack();
        NodeBasedStack RushCDs = new NodeBasedStack();
        NodeBasedStack PinkFloydCDs = new NodeBasedStack();
        NodeBasedStack IronMaidenCDs = new NodeBasedStack();
        NodeBasedStack EnglishCDs = new NodeBasedStack();
        NodeBasedStack inUseCD = new NodeBasedStack();

        int option;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("""
                    \nEnter 1 to enter CD info for sorting
                    Enter 2 to look at the top of each stack
                    Enter 3 remove a CD from top of the stack of your choice for playback
                    Enter 4 to get the size of each CD stack
                    Enter 5 to look at the contents of each CD stack
                    Enter 6 to get the total size of all CD stacks
                    Enter 7 to end the program""");

            option = keyboard.nextInt();

            String artistName; // variables to keep track of CD details
            String albumName;
            String lyricLanguage;

            int lastStack = 0;

            if (option == 1) { // option for entering CD info
                System.out.println("\nWhat CD would you like to sort? Enter the artist's name, album's name, and lyric language on separate lines (capitalization matters)");
                keyboard.nextLine();
                artistName = keyboard.nextLine();
                albumName = keyboard.nextLine();
                lyricLanguage = keyboard.nextLine();

                if (!lyricLanguage.equals("English")) {
                    nonEnglishCDs.push(new CD(artistName, albumName, lyricLanguage));
                    System.out.println("\nCD sorted into the non-English CD stack");
                } else if (Objects.equals(artistName, "Rush")) {
                    RushCDs.push(new CD(artistName, albumName, lyricLanguage));
                    System.out.println("\nCD sorted into the Rush CD stack");
                } else if (Objects.equals(artistName, "Pink Floyd")) {
                    PinkFloydCDs.push(new CD(artistName, albumName, lyricLanguage));
                    System.out.println("\nCD sorted into the Pink Floyd CD stack");
                } else if (Objects.equals(artistName, "Iron Maiden")) {
                    IronMaidenCDs.push(new CD(artistName, albumName, lyricLanguage));
                    System.out.println("\nCD sorted into the Iron Maiden CD stack");
                } else {
                    EnglishCDs.push(new CD(artistName, albumName, lyricLanguage));
                    System.out.println("\nCD sorted into the English CD stack");
                }
            } else if (option == 2) { // option to look at the top of each stack

                System.out.println("Top of Non-English CDs - " + nonEnglishCDs.peek());
                System.out.println("Top of Rush CDs - " + RushCDs.peek());
                System.out.println("Top of Pink Floyd CDs - " + PinkFloydCDs.peek());
                System.out.println("Top of Iron Maiden CDs - " + IronMaidenCDs.peek());
                System.out.println("Top of English CDs - " + EnglishCDs.peek());
                System.out.println("Top of In Use CD - " + inUseCD.peek());

            } else if (option == 3) { // option to remove CD from stack of user choice for playback

                System.out.println("""
                        \nEnter 1 to remove a CD from the top of the non-English CD stack
                        Enter 2 to remove a CD from the top of the Rush CD stack
                        Enter 3 to remove a CD from the top of the Pink Floyd CD stack
                        Enter 4 to remove a CD from the top of the Iron Maiden CD stack
                        Enter 5 to remove a CD from the top of the English CD stack
                        Enter 6 to automatically return the CD at the top of the in-use CD stack""");

                option = keyboard.nextInt();

                switch (option) {
                    case 1:
                        try {
                            inUseCD.push(nonEnglishCDs.top());
                            nonEnglishCDs.pop();
                            System.out.println("\nCD: " + inUseCD.peek() + "\nremoved and put into the in use CD stack");
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            inUseCD.push(RushCDs.top());
                            RushCDs.pop();
                            System.out.println("\nCD: " + inUseCD.peek() + "\nremoved and put into the in use CD stack");
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            inUseCD.push(PinkFloydCDs.top());
                            PinkFloydCDs.pop();
                            System.out.println("\nCD: " + inUseCD.peek() + "\nremoved and put into the in use CD stack");
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            inUseCD.push(IronMaidenCDs.top());
                            IronMaidenCDs.pop();
                            System.out.println("\nCD: " + inUseCD.peek() + "\nremoved and put into the in use CD stack");
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            inUseCD.push(EnglishCDs.top());
                            EnglishCDs.pop();
                            System.out.println("\nCD: " + inUseCD.peek() + "\nremoved and put into the in use CD stack");
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            CD tempCD = (CD) inUseCD.top();
                            if (!tempCD.getLyricLanguage().equals("English")) {
                                nonEnglishCDs.push(inUseCD.top());
                                inUseCD.pop();
                                System.out.println("\nRemoved CD sorted into the non-English CD stack");
                            } else if (tempCD.getName().equals("Rush")) {
                                RushCDs.push(inUseCD.top());
                                inUseCD.pop();
                                System.out.println("\nRemoved CD sorted into the Rush CD stack");
                            } else if (tempCD.getName().equals("Pink Floyd")) {
                                PinkFloydCDs.push(inUseCD.top());
                                inUseCD.pop();
                                System.out.println("\nRemoved CD sorted into the Pink Floyd CD stack");
                            } else if (tempCD.getName().equals("Iron Maiden")) {
                                IronMaidenCDs.push(inUseCD.top());
                                inUseCD.pop();
                                System.out.println("\nRemoved CD sorted into the Iron Maiden CD stack");
                            } else {
                                EnglishCDs.push(inUseCD.top());
                                inUseCD.pop();
                                System.out.println("\nRemoved CD sorted into the English CD stack");
                            }
                        }
                        catch(StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                }
            } else if (option == 4) { // option for putting the size of each stack to output

                System.out.println("Non-English CD #: " + nonEnglishCDs.size());
                System.out.println("Rush CD #:  " + RushCDs.size());
                System.out.println("Pink Floyd CD #: " + PinkFloydCDs.size());
                System.out.println("Iron Maiden CD #: " + IronMaidenCDs.size());
                System.out.println("English CD #: " + EnglishCDs.size());
                System.out.println("In Use CD #: " + inUseCD.size());

            } else if (option == 5) { // option for putting contents of each stack to output

                System.out.println("Non-English CDs: " + nonEnglishCDs);
                System.out.println("Rush CDs: " + RushCDs);
                System.out.println("Pink Floyd CDs: " + PinkFloydCDs);
                System.out.println("Iron Maiden CDs: " + IronMaidenCDs);
                System.out.println("English CDs: " + EnglishCDs);
                System.out.println("In Use CD: " + inUseCD);

            } else if (option == 6) { // option for returning total amount of CDs

                int totalSize = nonEnglishCDs.size() + RushCDs.size() + PinkFloydCDs.size() + IronMaidenCDs.size() + EnglishCDs.size() + inUseCD.size();
                System.out.print("\nTotal # of CDs: " + totalSize + "\n");

            } else if (option == 7) { // option for exit

                System.out.println("\nGoodbye");

            } else {

                System.out.println("\nError!");

            }
        }
        while(option != 7); {
        }
    }
}