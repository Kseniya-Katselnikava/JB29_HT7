//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В
//        случае недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения
//        времени на заданное количество часов, минут и секунд.

package by.epam.jb29.task09;

public class Time {
    private int hour;
    private int min;
    private int sec;


    public Time() {
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hour, int min, int sec) {
        if (hour >=0 && hour <= 23) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
        if (min >=0 && hour <= 59) {
            this.min = min;
        }
        else {
            this.min = 0;
        }
        if (sec >=0 && sec <= 59) {
            this.sec = sec;
        }
        else {
            this.sec = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >=0 && hour <= 23) {
            this.hour = hour;
        }
        else {
            this.hour = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >=0 && hour <= 59) {
            this.min = min;
        }
        else {
            this.min = 0;
        }
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec >=0 && sec <= 59) {
            this.sec = sec;
        }
        else {
            this.sec = 0;
        }
    }

    public void show (){
        System.out.println("Часы: " + getHour() + "; Минуты: " + getMin() + "; Секунды: " + getSec());
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.show();

        Time time1 = new Time(24, 15, 26);
        time1.show();

        time1.setHour(23);
        time1.setMin(59);
        time1.setSec(74);
        time1.show();
    }
}
