//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
//        методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
//        конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//        Найти и вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package by.epam.jb29.task09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Customer_Test {
    public static void main(String[] args)
    {
        ArrayList customers = new ArrayList();
        customers.add(new Customer("Петров", "Иван", "Семенович", "Минск", 111, 999));
        customers.add(new Customer("Иванов", "Николай", "Игоречив", "Пинск", 222, 888));
        customers.add(new Customer("Сидоров", "Петр", "Иванович", "Гродно", 333, 777));
        customers.add(new Customer("Терехов", "Алексей", "Юрьевич", "Минск", 444, 666));
        customers.add(new Customer("Енотов", "Кот", "Матвеевич", "Мир", 555, 111));

        Collections.sort(customers, Customer.customer_sort);
        Iterator<Customer> i = customers.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("\n");

        ArrayList customers_card = find_card(customers, 100, 300);
        Iterator<Customer> i1 = customers_card.iterator();

        while(i1.hasNext()) {
            System.out.println(i1.next());
        }


    }
    public static ArrayList <Customer> find_card (ArrayList arr, int min, int max) {
        ArrayList <Customer> card_arr = new ArrayList<Customer>();
        Customer test = new Customer();

        for (int i = 0; i < arr.size(); i++) {
            test = (Customer) arr.get(i);
            if (test.getCredit_card() > min && test.getCredit_card() < max) {
                card_arr.add(test);
            }
        }
        return card_arr;
    }
}
