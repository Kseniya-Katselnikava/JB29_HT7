//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
//        Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих
//        оценки, равные только 9 или 10.

package by.epam.jb29.task09;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group_number;
    private int [] estimate = new int [5];

    public Student(String name, String group_number, int [] estimate) {
        this.name = name;
        this.group_number = group_number;
        this.estimate = estimate;
    }

    public Student() {
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student stud1 = new Student("Cat1", "TT11", new int[]{1, 5, 7, 8, 9});
        Student stud2 = new Student("Cat2", "TT12", new int[]{9, 10, 9, 9, 9});
        Student stud3 = new Student("Cat3", "TT13", new int[]{1, 5, 7, 8, 9});
        Student stud4 = new Student("Cat4", "TT12", new int[]{10, 10, 10, 9, 9});
        Student stud5 = new Student("Cat5", "TT11", new int[]{1, 5, 7, 8, 9});
        Student stud6 = new Student("Cat6", "TT13", new int[]{10, 10, 10, 9, 9});
        Student stud7 = new Student("Cat7", "TT11", new int[]{1, 5, 7, 8, 9});
        Student stud8 = new Student("Cat8", "TT13", new int[]{9, 10, 9, 9, 9});
        Student stud9 = new Student("Cat9", "TT12", new int[]{10, 10, 10, 9, 9});
        Student stud10 = new Student("Cat10", "TT12", new int[]{10, 10, 10, 9, 9});
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);
        students.add(stud5);
        students.add(stud6);
        students.add(stud7);
        students.add(stud8);
        students.add(stud9);
        students.add(stud10);

        Student stud = new Student();

        for (int i = 0; i < students.size(); i++) {
           if (stud.estimation(students.get(i).estimate)) {
               System.out.println(students.get(i).name + " " + students.get(i).group_number);
           }
        }
    }

    public boolean estimation(int [] a) {
        boolean flag= false;
        for (int i = 0; i < a.length; i++){
            if (a[i] == 9 || a[i] == 10) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}




