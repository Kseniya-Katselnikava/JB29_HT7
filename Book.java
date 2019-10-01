//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//        и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
//        и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//        Найти и вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года.

package by.epam.jb29.task09;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publish;
    private int year;
    private int count_page;
    private int price;
    private String type;
    private static int countBook;

    public Book() {
    }

    public Book(String title, String author, String publish, int year, int count_page, int price, String type) {
       id = ++countBook;
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.count_page = count_page;
        this.price = price;
        this.type = type;
    }

    static {
        countBook = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount_page() {
        return count_page;
    }

    public void setCount_page(int count_page) {
        this.count_page = count_page;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCountBook() {
        return countBook;
    }

    public static void setCountBook(int countBook) {
        Book.countBook = countBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Издательство='" + publish + '\'' +
                ", Год издания=" + year +
                ", Количество страниц=" + count_page +
                ", Цена=" + price +
                ", Тип='" + type + '\'' +
                 '}' + "\n";
    }
}
