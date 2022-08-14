import java.time.*;
public class Main {
    public static void main(String[] args) {
        //Задание 1
        int unsureYear = 2022;
        printLeapYear(unsureYear);

        //Задание 2
        int clientDeviceYear = LocalDate.now().getYear();
        int clientOS = 0;
        defineAndPrintVersion(clientDeviceYear, clientOS);

        //Задание 3
        int deliveryDistance = 95;
        defineAndPrintDeliveryTerm(deliveryDistance);


    }

    public static void printLeapYear(int year){
        if  (year % 100 !=0 && year % 4 == 0 | year % 400 ==0){
            System.out.println(year + " — високосный год");
        }
        else{
            System.out.println(year + " — не високосный год.");
        }
    }

    public static void defineAndPrintVersion(int clientDeviceYear, int clientOS){

        if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");}
        else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}
        else{
            System.out.println("Приложение под вашу ОС еще не создано");}
    }

    public static void defineAndPrintDeliveryTerm(int deliveryDistance){

        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день на доставку.");
        }else if(deliveryDistance >=20 && deliveryDistance < 60){
            System.out.println("Потребуется 2 дня на доставку.");
        }else if (deliveryDistance>=60 && deliveryDistance <100){
            System.out.println("Потребуется 3 дня на доставку.");
        }else {
            System.out.println("К сожалению, доставка на такое расстояние не производится.");}
}

}