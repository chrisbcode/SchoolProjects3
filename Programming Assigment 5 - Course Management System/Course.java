/**
 * @author Christopher Bergsveinsson
 * @version 12/4/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 6 - Course Tracker with NodeBasedList - Course class
 */

public class Course {

    private String courseAbbreviation;
    private int courseNumber = -1;
    private String courseName;
    private String semesterTook;
    private String courseGrade;

    public Course() {
        super();
    }

    public Course(String courseAbbreviation, int courseNumber, String courseName) {
        this.courseAbbreviation = courseAbbreviation;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    public Course(String courseAbbreviation, int courseNumber, String courseName, String semesterTook, String courseGrade) {
        this.courseAbbreviation = courseAbbreviation;
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.semesterTook = semesterTook;
        this.courseGrade = courseGrade;
    }


    public String getCourseAbbreviation() {
        return courseAbbreviation;
    }

    public void setCourseAbbreviation(String courseAbbreviation) {
        this.courseAbbreviation = courseAbbreviation;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSemesterTook() {
        return semesterTook;
    }

    public void setSemesterTook(String semesterTook) {
        this.semesterTook = semesterTook;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    @Override
    public String toString() {

        if(this.semesterTook != null && this.courseGrade != null) {
            return "Course: " + this.courseAbbreviation + this.courseNumber + " Name: " + this.courseName + " Semester took: " + this.semesterTook + " Grade given: " + this.courseGrade;
        }
        else {
            return "Course: " + this.courseAbbreviation + this.courseNumber + " Name: " + this.courseName;
        }

    }

    @Override
    public boolean equals(Object obj) {
        return this.courseAbbreviation.equals(((Course) obj).getCourseAbbreviation()) && this.courseNumber == ((Course) obj).getCourseNumber() && this.courseName.equals(((Course) obj).getCourseName());
    }
}
