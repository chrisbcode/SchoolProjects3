/**
 * @author Christopher Bergsveinsson
 * @version 10/2/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - NodeBasedStack class
 */

public class NodeBasedStack<T> extends UnboundedStack<T>
{
    private Node<T> top;

    public NodeBasedStack() {
        top = null;
    }

    @Override
    public void push(T item) {
        Node<T> currentNode = new Node<>(item);
        if(top == null) { //if the stack is empty
            top = currentNode;
        }
        else {
            currentNode.setLink(top);
            top = currentNode;
        }
    }

    @Override
    public void pop() throws StackEmptyException {
        if(top != null) {
            top = top.getLink();
        }
        else {
            throw new StackEmptyException("Pop attempted on an empty stack!");
        }
    }
    @Override
    public String peek() {
        String topItem;
        if(top != null) {
            topItem = top.getData().toString();
        }
        else {
            topItem = "Stack is empty!";
        }
        return topItem;
    }

    public int size() {
        int size = 0;
        Node<T> currentNode = top;
        while(currentNode != null) {
            currentNode = currentNode.getLink();
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        Node<T> currentNode = top;
        StringBuilder stackInfo = new StringBuilder();
        while(currentNode != null) {
            stackInfo.append(currentNode.getData().toString() + "\n");
            currentNode = currentNode.getLink();
        }
        return stackInfo.toString();
    }
}
