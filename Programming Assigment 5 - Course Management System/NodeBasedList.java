/**
 * @author Christopher Bergsveinsson
 * @version 12/4/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 6 - Course Tracker with NodeBasedList - NodeBasedList
 */

public class NodeBasedList<D> implements ListInterface<D> {

    private Node list;

    public NodeBasedList() {
        super();
        list = null;
    }

    @Override
    public void add(D item) {
        Node currentNode = new Node(item);
        if (list == null) { //if the list is empty
            list = currentNode;
        } else {
            currentNode.setLink(list);
            list = currentNode;
        }
    }

    @Override
    public boolean find(D item) {
        boolean found = false;
        Node currentNode = list;
        while (!found && currentNode != null) {
            if (currentNode.getData().equals(item)) {
                found = true;
            } else {
                currentNode = currentNode.getLink();
            }
        }
        return found;
    }

    @Override
    public ListInterface<D> difference(ListInterface<D> secondList) {
        return null;
    }

    @Override
    public boolean remove(D item) {
        boolean found = false;
        Node currentNode = list;
        while (!found && currentNode != null) {
            if (currentNode.getData().equals(item)) {
                found = true;
            } else {
                currentNode = currentNode.getLink();
            }
        }
        boolean removed = false;
        if (found) {
            if (currentNode == list) {
                list = list.getLink();
            } else {
                Node previousNode = list;
                while (previousNode != null && previousNode.getLink() !=
                        currentNode) {
                    previousNode = previousNode.getLink();
                }
                previousNode.setLink(currentNode.getLink());
            }
            removed = true;
        }
        return removed;
    }

    @Override
    public String toString() {
        StringBuilder listString = new StringBuilder();
        Node currentNode = list;

        while (currentNode != null) {
            listString.append(currentNode.getData());
            currentNode = currentNode.getLink();
        }

        return listString.toString();
    }

    private class Node extends Object {
        private D data;
        private Node link;

        public Node(D newData) {
            super();
            data = newData;
            link = null;
        }

        //non-static methods
        public void setData(D newData) {
            data = newData;
        }

        public D getData() {
            return data;
        }

        public void setLink(Node otherNode) {
            this.link = otherNode;
        }

        public Node getLink() {
            return link;
        }
    }
}
