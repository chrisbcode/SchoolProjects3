/**
 * @author Christopher Bergsveinsson
 * @version 10/30/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 3 - Queue ADT for class waitlist - QueueFullException
 */

public class QueueFullException extends Exception
{
    public QueueFullException() {
        super();
    }

    public QueueFullException(String message) {
        super(message);
    }

}
