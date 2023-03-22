package Homework;

public class Book {
    private String name;
    private int year;
    private Author author;

    public Book(String name, int year, Author author) {
        this.name = name;
        this.year = year;
        this.author = author;
    }
    public String getName(){
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + author;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b1 = (Book) other;
        return name.equals(b1.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}