//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//        и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
//        и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//        Найти и вывести:
//        a) список книг заданного автора;
//        b) список книг, выпущенных заданным издательством;
//        c) список книг, выпущенных после заданного года.

package by.epam.jb29.task09;

public class Book_Test {
    public static void main(String[] args) {
        Book_Arr books = new Book_Arr();

        books.add(new Book("Книга", "Автор", "Космос", 1980, 245, 50, "Кожа"));
        books.add(new Book("Книга1", "Автор1", "Издательство1", 1986, 300, 150, "Кожа"));
        books.add(new Book("Книга2", "Автор2", "Космос", 1990, 345, 250, "Кожа"));
        books.add(new Book("Книга3", "Автор3", "Издательство2", 2000, 350, 350, "Кожа"));
        books.add(new Book("Книга4", "Автор2", "Издательство3", 1996, 345, 250, "Кожа"));

        Book cust = new Book();
        System.out.println(find_author(books, "Автор2"));
        System.out.println("\n" + find_publish(books, "Космос"));
        System.out.println("\n" + find_year(books, 1990));


    }


    public static Book_Arr find_author (Book_Arr arr, String author) {
       Book_Arr arr_res = new Book_Arr();

        for (int i = 0; i < arr.getBooks().size(); i++) {
           if(arr.getBooks().get(i).getAuthor().compareTo(author) == 0) {
               arr_res.add(arr.getBooks().get(i));
            }
        }
        return arr_res;
    }


    public static Book_Arr find_publish (Book_Arr arr, String publish) {
        Book_Arr arr_res = new Book_Arr();

        for (int i = 0; i < arr.getBooks().size(); i++) {
            if(arr.getBooks().get(i).getPublish().compareTo(publish) == 0) {
                arr_res.add(arr.getBooks().get(i));
            }
        }
        return arr_res;
    }

    public static Book_Arr find_year (Book_Arr arr, int year) {
        Book_Arr arr_res = new Book_Arr();

        for (int i = 0; i < arr.getBooks().size(); i++) {
            if(arr.getBooks().get(i).getYear() >= year) {
                arr_res.add(arr.getBooks().get(i));
            }
        }
        return arr_res;
    }
}

