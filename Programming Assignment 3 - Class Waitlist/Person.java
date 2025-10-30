/**
 * @author Christopher Bergsveinsson
 * @version 10/30/2025
 * CSC 223
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 3 - Queue ADT for class waitlist - Person class
 */
public class Person {

    private String name;

    public Person() {
        name = "";
    }

    public Person(String name) {
        this.name = name;
    }


    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return this.name.equals(person.getName());
    }

}

