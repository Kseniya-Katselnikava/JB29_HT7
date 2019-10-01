//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

package by.epam.jb29.task09;

public class Test1 {

    private int a;
    private int b;

   public static void main(String[] args) {
        Test1 test = new Test1();
        test.setA(10);
        test.setB(15);
        test.show();
        test.sum(test.getA(), test.getB());
        test.compare(test.getA(), test.getB());
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void show (){
        System.out.println("a = " + a + " ; b = " + b);
    }

    public void sum (int a, int b){
       int sum = a + b;
        System.out.println("Сумма переменнных a = " + this.a + " и b = " + this.b + " равна: " + sum);
    }

    public void compare (int a, int b){
        if (a > b) {
            System.out.println("Значение a больше b.");
        }
        else {
            System.out.println("Значение b больше a.");
        }
    }

}
