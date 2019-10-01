//Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
//        по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
//        пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
//        одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

package by.epam.jb29.task09;

import java.util.*;

public class Train {
    private String destination;
    private int train_number;
    private int time;

    public Train(String destination, int train_number, int time) {
        this.destination = destination;
        this.train_number = train_number;
        this.time = time;
    }

    public Train() {
    }

    public void create(){
        System.out.println("Введите пункт назначения");
        Scanner sc = new Scanner(System.in);
        destination = sc.nextLine();
        System.out.println("Введите номер поезда");
        sc = new Scanner(System.in);
        train_number = sc.nextInt();
        System.out.println("Введите время отправления");
        sc = new Scanner(System.in);
        time = sc.nextInt();
    }

    public static Train[] createArr(int n){
        Train arr[] = new Train[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Train();
            arr[i].create();
        }
        return arr;
    }

    public void show (){
        System.out.println("Пункт назначения: " + destination + "; Номер поезда: " + train_number + "; Время отправления: " + time);
    }

    public static void showArr (Train[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
    }

    public static void sort (Train[] arr){
        Train max;
        int index_max;
        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[i];
            index_max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (max.train_number > arr[j].train_number){
                    max = arr[j];
                    index_max = j;
                }
            }
            Train buf = arr[i];
            arr[i] = max;
            arr[index_max] = buf;
        }
        Train.showArr(arr);
    }

    public static void sort1 (Train[] arr){
        Train max;
        int index_max;
       for (int i = 0; i < arr.length - 1; i++) {
           max = arr[i];
           index_max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].destination.compareTo(arr[j].destination) > 0){
                    max = arr[j];
                    index_max = j;
                }
                else if (arr[i].destination.compareTo(arr[j].destination) == 0){
                    if (arr[i].train_number > arr[j].train_number) {
                        max = arr[j];
                        index_max = j;
                    }
                }
            }
           Train buf = arr[i];
           arr[i] = max;
           arr[index_max] = buf;
            }

        Train.showArr(arr);
    }

    public static void user_input (Train array[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean flag = false;
        System.out.print("\nВведите номер поезда: ");
        number = sc.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(array[i].train_number == number) {
                flag = true;
                break;
            }
        }

        if(flag == true) {
            System.out.println("");
            for(int i = 0; i < array.length; i++) {
                if(array[i].train_number == number) {
                    array[i].show();
                }
            }
        }else {
            System.out.println("\nПоезд с номером " + number + " в списке отсутствуют!!!");
        }
    }

    public static void main(String[] args) {
        Train arr [] = Train.createArr(5);

        Train.showArr(arr);
        Train.user_input(arr);
        Train.sort(arr);
        Train.sort1(arr);
    }
}
