package Homework;

public class Main {

   public static void main(String[] args) {
       Author leo = new Author("Лев", "Толстой");
       Author fedor = new Author("Фёдор", "Достоевский");
       Book warAndPeace = new Book("Война и Мир", 1863, leo);
       Book idiot = new Book("Идиот", 1867, fedor);
    }
}