//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get-
//        методы и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими
//        конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//        Найти и вывести:
//        a) список покупателей в алфавитном порядке;
//        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

package by.epam.jb29.task09;

import java.util.*;
import java.util.Comparator;

public class Customer {
    private int id;
    private String first_name;
    private String last_name;
    private String middle_name;
    private String address;
    private int credit_card;
    private int account_number;
    private static int countCustomer;

    public Customer(String last_name, String first_name, String middle_name, String address, int credit_card, int account_number) {
        id = ++countCustomer;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.address = address;
        this.credit_card = credit_card;
        this.account_number = account_number;
    }

    public Customer() {
    }

    static {
        countCustomer = 0;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(int credit_card) {
        this.credit_card = credit_card;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Фамилия='" + last_name + '\'' +
                ", Имя='" + first_name + '\'' +
                ", Отчество='" + middle_name + '\'' +
                ", Адресс='" + address + '\'' +
                ", Номер кредитной карточки=" + credit_card +
                ", Номер банковского счета=" + account_number +
                '}';
    }

    public static Comparator<Customer> customer_sort = new Comparator<Customer>() {

        public int compare(Customer s1, Customer s2) {
            String name1 = s1.getLast_name().toUpperCase();
            String name2 = s2.getLast_name().toUpperCase();

            return name1.compareTo(name2);
        }
    };
}




