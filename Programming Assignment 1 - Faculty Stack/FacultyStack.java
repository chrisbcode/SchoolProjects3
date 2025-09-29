/**
 * @author Christopher Bergsveinsson
 * @version 9/23/2025
 * CSC 223 
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 1 - Stack ADT program for Computer Science enrollment - FacultyStack Class
 */

import java.util.ArrayList;
import java.util.Stack;

public class FacultyStack extends Stack {

    private ArrayList<Faculty> facultyStack = new ArrayList<>();

    public FacultyStack() {
        super();
    }

    // implementations of the Stack ADT methods, which all use ArrayList<> methods
    public boolean empty() {
        return facultyStack.isEmpty();
    }

    public void push(Faculty facultyMember) {
        facultyStack.add(facultyMember);
    }

    public Faculty pop() {
        if(!this.empty()) {
            return facultyStack.removeLast();
        }
        return null;
    }

    public Faculty peek() {
        if(!this.empty()) {
            return facultyStack.getLast();
        }
        return null;
    }

    public int search(Faculty facultyMember) {
        if(!this.empty()) {
            for (int i = 0; i < facultyStack.size(); i++) {
                if (facultyStack.get(i).getName().equals(facultyMember.getName())) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    // the two toString methods to print faculty members from newest to oldest and vice versa
    @Override
    public String toString() {
        if(!this.empty()) {
            StringBuilder facultyOldtoNew = new StringBuilder(); // usage of the StringBuilder type allows for mutability and the append() method
            for (int i = facultyStack.size(); i > 0; i--) {
                facultyOldtoNew.append(facultyStack.get(i - 1).toString()).append("\n");
            }
            return facultyOldtoNew.toString();
        }
        return "";
    }

    public String toString2() {
        if (!this.empty()) {
            StringBuilder facultyNewtoOld = new StringBuilder();
            for (int i = 0; i < facultyStack.size(); i++) {
                facultyNewtoOld.append(facultyStack.get(i).toString()).append("\n");
            }
            return facultyNewtoOld.toString();
        }
        return "";
    }
}

