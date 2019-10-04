package by.epam.jb29.task09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Customers_Test {
    public static void main(String[] args) {
        Customers_Arr customers = new Customers_Arr();
        customers.add(new Customers("Петров", "Иван", "Семенович", "Минск", 111, 999));
        customers.add(new Customers("Иванов", "Николай", "Игоречив", "Пинск", 222, 888));
        customers.add(new Customers("Сидоров", "Петр", "Иванович", "Гродно", 333, 777));
        customers.add(new Customers("Терехов", "Алексей", "Юрьевич", "Минск", 444, 666));
        customers.add(new Customers("Енотов", "Кот", "Матвеевич", "Мир", 555, 111));

        System.out.println(find_card(customers, 100, 400));
        System.out.println();
        System.out.println(alfabet(customers));
    }

    public static Customers_Arr find_card(Customers_Arr arr, int min, int max) {
        Customers_Arr card_arr = new Customers_Arr();

        for (int i = 0; i < arr.getCustomers().size(); i++) {
            if (arr.getCustomers().get(i).getCredit_card() > min && arr.getCustomers().get(i).getCredit_card() < max) {
                card_arr.add(arr.getCustomers().get(i));
            }
        }
        return card_arr;
    }

    public static  ArrayList alfabet(Customers_Arr arr) {
        ArrayList card_arr = arr.getCustomers();
        Collections.sort(card_arr, Customers.customer_sort);

       return card_arr;
    }
}


