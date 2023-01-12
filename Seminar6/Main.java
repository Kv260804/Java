public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Veselov K.G.",
                385756, "Programming",
                "26.08.2004", "89067559931");

        Reader reader2 = new Reader("Ivanov I.I.",
                728723, "Math",
                "01.01.2001", "8998332898");
        Book book1 = new Book("Грокаем Алгоритмы", "Адитья Бхаргава");
        Book book2 = new Book("Python", "Б.Дауни");

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(book1);
        System.out.println(book2);
        reader2.takeBook(4);
        System.out.println();
        reader1.takeBook("Азбука", "Програмирования", "Аналитика", "Алгебра");
        reader1.returnBook("Азбука");
        reader2.takeBook(new Book("New book", "New Author"));
        reader2.returnBook(2);
        reader1.takeBook(book1, book2);
        reader1.returnBook(book1);

    }
}