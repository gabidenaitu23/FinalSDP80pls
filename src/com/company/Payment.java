package com.company;

interface Method{
    void scanCard();
    void giveMoney();
}

class Card implements Method{
    @Override
    public void scanCard() {
        System.out.println("payment with byCard completed successfully!");
        System.out.println("Thank you!");
    }
    public void giveMoney() {}
}

class Cash implements Method{
    public void scanCard(){}

    @Override
    public void giveMoney() {
        System.out.println("payment with Cash was accepted!");
        System.out.println("Thank you!");
    }
}

public class Payment{
    private final String clientName;
    Method method = null;
    Payment(Client client){
        clientName = client.getName();
    }
    public void using(Method method){
        this.method = method;
    }
    public void pay(){
        System.out.print("Dear, " + clientName + ", ");
        if (method instanceof Card)
            method.scanCard();
        else
            method.giveMoney();
    }
}
