/**
 * @author Christopher Bergsveinsson
 * @version 10/2/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - UnboundedStack class
 */

public abstract class UnboundedStack<T> extends Stack<T>
{
    public UnboundedStack() {
        super();
    }
    public UnboundedStack(String name) {
        super(name);
    }

    @Override
    public abstract void push(T item);

    public abstract int size();
}
