//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get-
//        методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими
//        конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//        Найти и вывести:
//        a) список рейсов для заданного пункта назначения;
//        b) список рейсов для заданного дня недели;
//        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

package by.epam.jb29.task09;

public class Airline {
    private String destination;
    private int flight_number;
    private String plane_type;
    private String time;
    private String day_of_week;

    public Airline() {
    }

    public Airline(String destination, int flight_number, String plane_type , String time, String day_of_week) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.plane_type = plane_type;
        this.time = time;
        this.day_of_week = day_of_week;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getPlane_type() {
        return plane_type;
    }

    public void setPlane_type(String plane_type) {
        this.plane_type = plane_type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "Пункт назначения='" + destination + '\'' +
                ", Номер рейса=" + flight_number +
                ", Тип самолета=" + plane_type +
                ", Время вылета='" + time + '\'' +
                ", Дни недели='" + day_of_week + '\'' +
                '}'+ "\n";
    }
}
