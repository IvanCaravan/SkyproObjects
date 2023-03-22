package Homework;

public class Author {
    private String firstName;
    private String surName;

    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurName() {
        return this.surName;
    }

    @Override
    public String toString() {
        return firstName + " " + surName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a1 = (Author) other;
        return firstName.equals(a1.firstName);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }
}
