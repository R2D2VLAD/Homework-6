package lesson6;

public class lesson6 {
        public static void main(String[] args) {
            //Домашнее задание
            System.out.println("Домашнее задание");
            //Задание 1
            System.out.println("Задание 1");
            int clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            //Задание 2
            System.out.println("Задание 2");
            int clientDevaceYear = 2014;
            if (clientOS == 0) {
                if (clientDevaceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                }
            } else {
                if (clientDevaceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");

                }
            }

            //Задание 3
            System.out.println("Задание 3");
            int year = 1973;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным!");
            } else {
                System.out.println(year + " год не является високосным!");
            }

            //Задание 4
            System.out.println("Задание 4");
            int deliveryDistance = 150;
            int deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);

            //Задание 5
            System.out.println("Задание 5");
            int monthNumber = 5;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Неккоректный месяц!");
            }
        }
    }
