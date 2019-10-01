//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
//        Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

package by.epam.jb29.task09;

public class Test2 {
    private int a;
    private int b;

    public Test2 (){
        a = 20;
        b = 25;
    }

    public Test2 (int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Test2 test = new Test2(15, 16);
        Test2 test1 = new Test2();

        test.show();
        test1.setA(15);
        test1.setB(17);
        test.show();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void show (){
        System.out.println("a = " + a + " ; b = " + b);
    }
}
