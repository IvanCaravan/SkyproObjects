package Homework;

public class App {
    public static void main(String[] args) {
        Author leo = new Author(" Лев", " Толстой");
        Author fedor = new Author(" Фёдор", " Достоевский");
        Book warAndPeace = new Book("Война и Мир ", 1863, leo);
        Book idiot = new Book("Идиот ", 1867, fedor);
        System.out.println("Книга " + warAndPeace.getName() + warAndPeace.getYear() + leo.getFirstName() + leo.getSurName());
        System.out.println("Книга " + idiot.getName() + idiot.getYear() + fedor.getFirstName() + fedor.getSurName());
        idiot.setYear(1870);
        System.out.println(idiot.getYear());
        // Задание с методами объектов:
        Author alex = new Author("Александр", "Беляев");
        System.out.println(new Book("Человек-амфибия", 1928, alex));

        Author a = new Author("Мэтью", "Стокоу");
        Author a1 = new Author("Мэтью", "Петров");
        System.out.println(a.equals(a1));

        Book b = new Book("Коровы", 2004, a);
        Book b1 = new Book("Коровы", 2004, a1);
        System.out.println(b.equals(b1));
     }
}
