package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	task6();
    task7();
    task8();
    task9("aabccddefgghiijjkk");
    task10();
        //task1(1880);
   // task2(1,2015);
   // System.out.println("Потребуется дней -- " +task3(95));
   // task4("abccddefgghiijjkk");

  //  int [] arr={3, 2, 1, 6, 5};
  //  task5(arr);
  //  System.out.println(Arrays.toString(arr));
    }
    public static void task6() {

        String fullName = "Ivanov Ivan Ivanovich"  ;
        int probelFirst=fullName.indexOf(" ");
        int probelLast=fullName.lastIndexOf(" ");
        String middleName  = fullName.substring(probelLast);
        String firstName= fullName.substring(probelFirst,probelLast) ;
        String lastName = fullName.substring(0,probelFirst);

        System.out.println("Имя сотрудника — "+ firstName);
        System.out.println("Фамилия сотрудника — "+ lastName);
        System.out.println("Отчество сотрудника — "+ middleName);

    }
    public static void task7() {
        String fullName = "ivanov ivan ivanovich";
        int firstSymbloFirstlName=0;
        int firstSymbolMiddleName = fullName.indexOf(" ")+1;
        int firstSymbolLastName=fullName.lastIndexOf(" ")+1;
        char [] arr=fullName.toCharArray();

        arr[firstSymbloFirstlName]=Character.toUpperCase(arr[firstSymbloFirstlName]);
        arr[firstSymbolMiddleName]=Character.toUpperCase(arr[firstSymbolMiddleName]);
        arr[firstSymbolLastName]=Character.toUpperCase(arr[firstSymbolLastName]);

        fullName=String.valueOf(arr);
        System.out.println("Вернонаписанное имя сотрудника с заглавных букв  —" + fullName);
    }
    public static void task8() {
        String str1 = "135";
        String str2 = "246";
        StringBuilder str=new StringBuilder(str1);
        for(int i=0;i<str1.length();i++){
            str.insert(i+i+1,str2.charAt(i));
        }
       System.out.println("Данные строки  —" + str);
    }
    public static void task9(String sortedString) {
        String strDouble="";
        for (int i = 0; i < sortedString.length()-1; i=i+1) {
            if (sortedString.charAt(i) == sortedString.charAt(i+1)) {
                  System.out.print(sortedString.charAt(i));
            }

        }
        System.out.println();
    }
    public static void task10() {
        int[] arr = generateRandomArray();
        averagePayment(arr);
        System.out.println("Средняя сумма трат за месяц составила " +  averagePayment(arr)+" рублей");

    }
    public static double averagePayment(int [] arr) {
        int sumPayment = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumPayment += arr[i];
        }
        double averagePayment=(double)sumPayment/30;
        return averagePayment;
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
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



