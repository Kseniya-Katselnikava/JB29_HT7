package by.epam.jb29.task09;

import java.util.Comparator;

public class Customers {
    private int id;
    private String first_name;
    private String last_name;
    private String middle_name;
    private String address;
    private int credit_card;
    private int account_number;
    private static int countCustomer;

    public Customers(String last_name, String first_name, String middle_name, String address, int credit_card, int account_number) {
        id = ++countCustomer;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.address = address;
        this.credit_card = credit_card;
        this.account_number = account_number;
    }

    public Customers() {
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
        return "Customers{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", address='" + address + '\'' +
                ", credit_card=" + credit_card +
                ", account_number=" + account_number +
                '}' + "\n";
    }

    public static Comparator<Customers> customer_sort = new Comparator<Customers>() {

        public int compare(Customers s1, Customers s2) {
            String name1 = s1.getLast_name().toUpperCase();
            String name2 = s2.getLast_name().toUpperCase();

            return name1.compareTo(name2);
        }
    };
}
