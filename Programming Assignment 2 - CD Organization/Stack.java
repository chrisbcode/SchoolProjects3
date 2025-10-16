/**
 * @author Christopher Bergsveinsson
 * @version 10/15/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - Stack class
 */

public abstract class Stack<T> extends Object
{
    private String name;

    public Stack() {
        super();
        name = "";
    }
    public Stack(String stackName) {
        super();
        name = stackName;
    }

    //non-static, concrete methods
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public abstract void push(T item) throws StackFullException;

    public abstract void pop() throws StackEmptyException; //method heading or

    public abstract String peek(); //method heading or abstract method
}