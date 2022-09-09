public class Main {
    public static void main(String[] args) {
        //Условный оператор урок 2. Домашнее задание
        //1.
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        //2.

        int clientOperatingSystem = 0;
        int clientDeviceYear = 2011;
        if (clientOperatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOperatingSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке.");
        }
        if (clientOperatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOperatingSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке.");
        }

        //3
        int year = 2021;
        int yearCheck = year % 4;
        int yearCheck100 = year % 100;
        int yearCheck400 = year % 400;
        if (yearCheck100 == 0) {
            System.out.println(year + " Год не високосный.");
        } else if (yearCheck != 0 && yearCheck400 != 0) {
            System.out.println(year + " Год не високосный.");
        } else {
            System.out.println(year + " Год високосный.");
        }

        //4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 ");
        }

        //5
        int monthNumber = 12;
        switch (monthNumber)
        case 1:
        case 2:
        case 12:
        System.out.println("Зимний сезон.");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println("Весенний сезон.");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("Летний сезон.");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println("Осенний сезон.");
        break;
        default:
        System.out.println("Такого месяца нет.");
    }

}
}