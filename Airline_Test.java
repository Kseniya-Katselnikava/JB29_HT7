//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
//        методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
//        конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//        Найти и вывести:
//        a) список рейсов для заданного пункта назначения;
//        b) список рейсов для заданного дня недели;
//        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package by.epam.jb29.task09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline_Test {
    public static void main(String[] args) throws ParseException {
        Airline_Arr airline = new Airline_Arr();

        airline.add(new Airline ("Минск", 21, "Boeing", "14:00", "Понедельник"));
        airline.add(new Airline ("Пинск", 21, "Airbus", "11:00", "Вторник"));
        airline.add(new Airline ("Минск", 21, "Sukhoi SuperJet", "15:00", "Понедельник"));
        airline.add(new Airline ("Гродно", 21, "Airbus", "10:00", "Среда"));
        airline.add(new Airline ("Минск", 21, "Sukhoi SuperJet", "20:00", "Суббота"));
        airline.add(new Airline ("Мир", 21, "Boeing", "07:00", "Понедельник"));

        System.out.println(day_of_week_and_time(airline, "Понедельник", "12:00"));
        System.out.println();
        System.out.println(destination(airline, "Минск"));
        System.out.println();
        System.out.println(day_of_week(airline, "Понедельник"));

    }

    public static Airline_Arr destination (Airline_Arr arr, String destination) {
        Airline_Arr arr_res = new Airline_Arr();

        for (int i = 0; i < arr.getAirline().size(); i++) {
                if(arr.getAirline().get(i).getDestination().compareTo(destination) == 0) {
                arr_res.add(arr.getAirline().get(i));
            }
        }
        return arr_res;
    }

    public static Airline_Arr day_of_week (Airline_Arr arr, String day_of_week) {
        Airline_Arr arr_res = new Airline_Arr();

        for (int i = 0; i < arr.getAirline().size(); i++) {
            if(arr.getAirline().get(i).getDay_of_week().compareTo(day_of_week) == 0) {
                arr_res.add(arr.getAirline().get(i));
            }
        }
        return arr_res;
    }

    public static Airline_Arr day_of_week_and_time (Airline_Arr arr, String day_of_week, String time) throws ParseException {
        Airline_Arr arr_res = new Airline_Arr();

            for (int i = 0; i < arr.getAirline().size(); i++) {
            SimpleDateFormat parser = new SimpleDateFormat("HH:mm");
            Date user_time = parser.parse(time);
            Date time1 =  parser.parse(arr.getAirline().get(i).getTime());

            if(arr.getAirline().get(i).getDay_of_week().compareTo(day_of_week) == 0 &&
                time1.after(user_time))
                arr_res.add(arr.getAirline().get(i));
            }
         return arr_res;
    }
}
