/**
 * @author Christopher Bergsveinsson
 * @version 10/30/2025
 * CSC 223
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 3 - Queue ADT for class waitlist - QueueEmptyException
 */

public class QueueEmptyException extends Exception
{
    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }
}

