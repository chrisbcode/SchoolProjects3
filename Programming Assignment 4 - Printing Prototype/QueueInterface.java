/**
 * @author Christopher Bergsveinsson
 * @version 10/30/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 4 - Printing Prototype - PrintDemo
 */

public interface QueueInterface<E>
{
    public abstract void enqueue(E item) throws QueueFullException;

    public abstract E dequeue() throws QueueEmptyException;

    public abstract String look();
}