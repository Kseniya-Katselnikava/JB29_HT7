//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
//        методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
//        конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//        Найти и вывести:
//        a) список рейсов для заданного пункта назначения;
//        b) список рейсов для заданного дня недели;
//        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package by.epam.jb29.task09;

import java.util.ArrayList;

public class Airline_Arr {
    ArrayList<Airline> airline;

    public Airline_Arr() {
        airline = new ArrayList<Airline>();
    }

    public ArrayList<Airline> getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        return String.valueOf(airline);
    }

    public void add (Airline line){
        airline.add(line);
    }
}
