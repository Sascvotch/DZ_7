package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	task1(1880);
    task2(1,2015);
    System.out.println("Потребуется дней -- " +task3(95));
    task4("abccddefgghiijjkk");

    int [] arr={3, 2, 1, 6, 5};
    task5(arr);
    System.out.println(Arrays.toString(arr));
    }
    public static void task1(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year +"--Год високосный");
        } else {
            System.out.println(year+"--Год не високосный");
        }
    }
    public static void task2(int clientOS,int clientDeviceYear) {
        String clientOSName;
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 1) {
            clientOSName="Android";
        } else {
            clientOSName="iOS";
        }

       if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для " +clientOSName + " по ссылке");
       } else {
                System.out.println("Установите облегченную версию приложения для " + clientOSName +" по ссылке");
       }
    }
    public static int task3(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        return (deliveryDays);

    }
    public static void task4(String sortedString) {
        for (int i = 0; i < sortedString.length() - 1; i++) {
            for (int y = i + 1; y < sortedString.length() - 1; y++) {
                if (sortedString.charAt(i) == sortedString.charAt(y)) {
                    System.out.println("Совпадение найдено --" + sortedString.charAt(i));
                    return;
                } else {
                    break;
                }
            }
        }
        System.out.println("Совпадения не найдены");
    }
    public static void task5(int [] arr) {
        int arrElement=0 ;
        int lengthHalf=arr.length/2;
        for (int i = 0; i < lengthHalf ; i++) {
            arrElement= arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=arrElement;
        }
    }
 }



