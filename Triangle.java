//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//        площади, периметра и точки пересечения медиан.

package by.epam.jb29.task09;

public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int a;
    private int b;
    private int c;

      public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

      public void side (Triangle test) {
        a = (int) Math.sqrt(Math.pow(test.x2 - test.x1, 2) + Math.pow(test.y2 - test.y1, 2));
        b = (int) Math.sqrt(Math.pow(test.x3 - test.x1, 2) + Math.pow(test.y3 - test.y1, 2));
        c = (int) Math.sqrt(Math.pow(test.x3 - test.x2, 2) + Math.pow(test.y3 - test.y2, 2));
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
    }

    public int perimetr (){
        int P = a + b + c;
        return P;
    }

    public void square (){
        double p = perimetr() / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Площадь треугольника равна: %.3f \n", S);
    }

    public void tochka_med (Triangle test){
        int x = (test.x1 + test.x2 + test.x3) / 3;
        int y = (test.y1 + test.y2 + test.y3) / 3;

        System.out.println("Точка пересечения медиан [" + x + " , " + y + "]");
    }

    public static void main(String[] args) {
        Triangle test = new Triangle(10, 3, 15, 7, 9, 5 );
        test.side(test);
        System.out.println("Периметр треугольника равен: " + test.perimetr());
        test.square();
        test.tochka_med(test);

        Triangle test1 = new Triangle(11, 4, 13, 6, 18, 1 );
        test1.side(test1);
        System.out.println("Периметр треугольника равен: " + test1.perimetr());
        test1.square();
        test1.tochka_med(test1);
    }
}
