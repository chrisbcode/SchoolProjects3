/**
 * @author Christopher Bergsveinsson
 * @version 10/2/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - StackEmptyException
 */

public class StackEmptyException extends Exception{

    public StackEmptyException() {
        super();
    }

    public StackEmptyException(String message) {
        super(message);
    }

}