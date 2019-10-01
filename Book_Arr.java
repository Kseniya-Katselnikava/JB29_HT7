//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//        и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
//        и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//        Найти и вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года.

package by.epam.jb29.task09;

import java.util.ArrayList;

public class Book_Arr {
    ArrayList<Book> books;

    public Book_Arr() {
        books = new ArrayList<Book>();
    }

    public void add (Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {

        return String.valueOf(books);
//        return "Book_Arr{" +
//                "books=" + books +
//                '}';
    }

  }
