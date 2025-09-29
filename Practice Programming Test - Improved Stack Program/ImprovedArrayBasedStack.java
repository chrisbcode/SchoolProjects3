import java.util.ArrayList;

/**
 * @author Christopher Bergsveinsson
 * @version 9/25/2025
 * CSC 223
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Practice Test - ImprovedStackProgram - ImprovedArrayBasedStack Class
 */

public class ImprovedArrayBasedStack<T> extends ImprovedStack<T> {

    private int top;
    private T[] stack;

    public ImprovedArrayBasedStack() {
        top = -1;
        stack = (T[]) new Object[100];
    }

    public ImprovedArrayBasedStack(int size) {
        top = -1;
        stack = (T[]) new Object[size];
    }

    public void push(T item) throws StackFullException {
        if(top < stack.length - 1) {
            top++;
            stack[top] = item;
        }
        else {
            throw new StackFullException("Not enough room for one item");
        }
    }

    public void push(T item1, T item2) throws StackFullException {
        if(top < stack.length - 2) {
            top++;
            stack[top] = item1;
            top++;
            stack[top] = item2;
        }
        else {
            throw new StackFullException("Not enough room for two items");
        }
    }

    public void pop() throws StackFullException {
        if(top > -1) {
            stack[top] = null;
            top--;
        }
        else {
            throw new StackFullException("No item to remove");
        }
    }

    public void doublePop() throws StackFullException {
        if(top > 0) {
            stack[top] = null;
            top--;
            stack[top] = null;
            top--;
        }
        else {
            throw new StackFullException("There are less than two items in the stack");
        }
    }

    public T top() throws StackFullException {
        if(top > -1) {
            return stack[top];
        }
        else {
            throw new StackFullException("Top attempted on empty stack");
        }
    }



}

