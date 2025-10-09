/**
 * @author Christopher Bergsveinsson
 * @version 10/2/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - Node class
/**
 * @author Christopher Bergsveinsson
 * @version 10/2/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 2 - Stack ADT (Node Based Implementation) for organizing CDs - Node class
 */


public class Node<T> extends Object
{
    private T data;
    private Node<T> link;

    public Node(T newData) {
        super();
        data = newData;
        link = null;
    }

    public void setData(T newData) {
        data = newData;
    }
    public T getData() {
        return data;
    }
    public void setLink(Node<T> otherNode) {
        this.link = otherNode;
    }
    public Node<T> getLink() {
        return link;
    }
}
