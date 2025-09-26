/**
 * @author Christopher Bergsveinsson
 * @version 9/25/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Practice Test - ImprovedStackProgram - ImprovedStack Abstract Class
 */

public abstract class ImprovedStack<T> {

    public abstract void push(T item) throws StackFullException;

    public abstract void push(T item1, T item2) throws StackFullException;

    public abstract void pop() throws StackFullException;

    public abstract void doublePop() throws StackFullException;

    public abstract T top() throws StackFullException;

}
