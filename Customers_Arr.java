package by.epam.jb29.task09;

import java.util.ArrayList;

public class Customers_Arr  {

    ArrayList<Customers> customers;

    public Customers_Arr() {

        customers = new ArrayList<Customers>();
    }

    public void add (Customers customer){

        customers.add(customer);
    }

    public ArrayList<Customers> getCustomers() {

        return customers;
    }

    @Override

    public String toString() {
        return String.valueOf(customers);
    }
}

