package com.company;

public class Main {

    public static void main(String[] args) {
        // We are opening our Smart Canteen at AITU
        Service ComputerClub = new Service();

        // Clients has come to our Smart canteen ;)
        Client IvanIvanov = new Client("Ivan Ivanov");
        Client GabidenZhurunov = new Client("Gabiden Zhurunov");
        Client JoeBiden = new Client("Joe Biden");

        Staff staff4Meeting = new Staff();
        staff4Meeting.setAction(new Meeting());
        staff4Meeting.operate();

        System.out.println("#===========================================================================================#");

        ComputerClub.addClient(IvanIvanov);
        ComputerClub.addClient(GabidenZhurunov);
        ComputerClub.addClient(JoeBiden);

        ComputerClub.removeClient(JoeBiden);
        ComputerClub.reserve("Joe Biden");

        ComputerClub.notifyClients();

        System.out.println("#===========================================================================================#");

        Staff staff4Orders = new Staff();
        staff4Orders.setAction(new Orders());
        staff4Orders.operate();

        System.out.println("#===========================================================================================#");

        Tariff I = new Tariff();
        I.setTime(new Weekdays());
        I.changeTime();

        System.out.println("#===========================================================================================#");

        I.changeTime(); // shows weekdays price list

        System.out.println("#===========================================================================================#");

        I.changeTime(); // shows weekends price list

        System.out.println("#===========================================================================================#");

        Staff staff4Cheque = new Staff();
        staff4Cheque.setAction(new ProvideCheque());
        staff4Cheque.operate();

        System.out.println("#===========================================================================================#");

        Payment payment = new Payment(GabidenZhurunov);
        payment.using(new Card());
        payment.pay();

        System.out.println("#===========================================================================================#");

        Payment payment2 = new Payment(IvanIvanov);
        payment2.using(new Cash());
        payment2.pay();

        System.out.println("#===========================================================================================#");

        Staff staff4Cleaning = new Staff();
        staff4Cleaning.setAction(new Clearing());
        staff4Cleaning.operate();


    }
}
