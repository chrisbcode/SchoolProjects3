/**
 * @author Christopher Bergsveinsson
 * @version 10/30/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 3 - Queue ADT for class waitlist - Student class
 */

public class Student extends Person
{
    private int studentId;

    public Student() {
        super();
        studentId = 0;
    }
    public Student(String newName) {
        super(newName);
        studentId = 0;
    }
    public Student(String newName, int newStudentId) {
        super(newName);
        if(newStudentId > 0) {
            studentId = newStudentId;
        }
        else {
            studentId = 0;
        }
    }
    public Student(int newStudentId) {
        super();
        if(newStudentId > 0) {
            studentId = newStudentId;
        }
        else {
            studentId = 0;
        }
    }

    public void setStudentId(int newStudentId) {
        if(newStudentId > 0) {
            studentId = newStudentId;
        }
    }
    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return super.toString() + " | Student Id: " + studentId;
    }
    @Override
    public boolean equals(Object otherObject) {
        boolean areTheyEqual = false;
        if(otherObject != null && otherObject instanceof Student) {
            Student otherStudent = (Student)otherObject; //object type casting
            if(super.equals(otherObject) &&
                    this.studentId == otherStudent.studentId) {
                areTheyEqual = true;
            }
        }
        return areTheyEqual;
    }
}