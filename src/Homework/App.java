package Homework;

public class App {
    public static void main(String[] args) {
        Author leo = new Author(" Лев", " Толстой");
        Author fedor = new Author(" Фёдор", " Достоевский");
        Book warAndPeace = new Book("Война и Мир ", 1863, leo);
        Book idiot = new Book("Идиот ", 1867, fedor);
        System.out.println("Книга " + warAndPeace.getName() + warAndPeace.getYear() + leo.firstName + leo.surName);
        System.out.println("Книга " + idiot.getName() + idiot.getYear() + fedor.firstName + fedor.surName);
        idiot.setYear(1870);
        System.out.println(idiot.getYear());
    }
}
