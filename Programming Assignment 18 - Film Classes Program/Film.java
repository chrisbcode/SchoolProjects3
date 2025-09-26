/* Written by Christopher Bergsveinsson
 CSC 223
 Every Tuesday and  Thursday 9:35am → 11:35am
 Programming Assignment 18 - Film Classes - Film Class */

public class Film {

    private String filmName; // private variables for properties of the film class
    private String directorName;
    private int yearOfRelease;


    public Film() { // unique constructors that take different sets of parameters
        filmName = "";
        directorName = "";
        yearOfRelease = 0;
    }

    public Film(String filmName) { // unique constructors that take different sets of parameters
        this.filmName = filmName;
    }

    public Film(String filmName, String directorName) {
        this.filmName = filmName;
        this.directorName = directorName;
    }

    public Film(String filmName, String directorName, int yearOfRelease) {
        this.filmName = filmName;
        this.directorName = directorName;
        this.yearOfRelease = yearOfRelease;
    }

    public String getFilmName() { // getters and setters for the variables of this class
        return filmName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String toString() { // the toString method that utilizes the previously defined getters and setters
        return getFilmName() + " was a film directed by " + getDirectorName() + " released in the year of " + getYearOfRelease() + ".\n";
    }




}
