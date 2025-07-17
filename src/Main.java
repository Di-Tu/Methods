import java.time.LocalDate;


public class Main {
    //        Задача №1
    public static void checkYearLeap(int year) {
        if (year < 1584) {
            System.out.println("Введите более поздний год, чем 1584 год");
        } else if ((year % 4) != 0) {
            System.out.println(year + " год - невисокосный год");
        } else if ((year % 4) == 0 && (year % 100) == 0 && (year % 400) != 0) {
            System.out.println(year + " год - невисокосный год");
        } else {
            System.out.println(year + " год - високосный год");
        }
    }

    //        Задача №2
    public static void checkingTheApplicationVersion(byte clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        if (deviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOs по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOs по ссылке");
        }
    }

    //             Задача №3
    public static int calculateDeliveryTime(int distance) {
        int day = 0;
        if (distance <= 20) {
            day = 1;
        } else if (distance <= 60) {
            day = 2;
        } else if (distance <= 100) {
            day = 3;
        }
        return day;
    }

    public static void main(String[] args) {

//        Task №1
        System.out.println();
        System.out.println("          Задача №1");
        int year = 2021;
        checkYearLeap(year);

//                Task №2
        System.out.println();
        System.out.println("          Задача №2");
        byte clientOS = 1;
        int clientDeviceYear = 2015;
        checkingTheApplicationVersion(clientOS, clientDeviceYear);

//                  Task №3
        System.out.println();
        System.out.println("          Задача №3");
        int deliveryDistance = 95;
        int deliveryDay = calculateDeliveryTime(deliveryDistance);
        if (deliveryDay == 0) {
            System.out.println("Свыше 100км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDay + " срок доставки");
        }
    }
}