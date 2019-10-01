//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
//        значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по
//        умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и
//        метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности
//        класса.

package by.epam.jb29.task09;

public class Z5 {
    private int count;
    private final int MIN = 0;
    private final int MAX = 10;

     public Z5() {
       count = 0;
     }

    public Z5(int count) {
       this.count = count;

    }

    public int decr () {
         if (count > MIN) {
             count--;
         }
         return count;
    }

    public int incr () {
        if (count < MAX) {
            count++;
        }
        return count;
    }

    public int getCount() {
        return count;
    }

    public void show(){
        System.out.println(getCount());
    }

    public static void main(String[] args) {
        Z5 test = new Z5();
        test.incr();
        test.decr();
        test.show();
    }
}
