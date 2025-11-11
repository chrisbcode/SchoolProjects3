/**
 * @author Christopher Bergsveinsson
 * @version 11/11/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 4 - Printing Prototype - NodeBasedQueue Class
 */

public class NodeBasedQueue<E> implements UnboundedQueueInterface<E> {

    private Node<E> front;
    private Node<E> rear;

    public NodeBasedQueue() {
        super();
        front = null;
        rear = null;
    }

    @Override
    public void enqueue(E item) {
        Node<E> currentNode = new Node<E>(item);
        if (front == null && rear == null) { //if the queue is empty
            rear = currentNode;
            front = currentNode;
        } else {
            rear.setLink(currentNode);
            rear = currentNode;
        }
    }

    @Override
    public String look() {
        String frontItem;
        if (front == null && rear == null) {
            frontItem = "Queue is empty!";
        } else {
            frontItem = front.getData().toString();
        }
        return frontItem;
    }

    @Override
    public int size() {
        int size = 0;
        Node<E> currentNode = front;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getLink();
        }
        return size;
    }

    @Override
    public E dequeue() throws QueueEmptyException {
        if (front == null && rear == null) {
            throw new QueueEmptyException("Dequeue attempted on an empty queue!");
        }
        else {
            E frontItem = front.getData();
            front = front.getLink();
            if (front == null) {
                rear = null;
            }
            return frontItem;
        }
    }

    @Override
    public String toString() {
        Node<E> currentNode = front;
        StringBuilder queueInfo = new StringBuilder();

        while (currentNode != null) {
            queueInfo.append(currentNode.getData().toString()).append("\n");
            currentNode = currentNode.getLink();
        }

        return queueInfo.toString();
    }

}