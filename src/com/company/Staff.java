package com.company;

interface Action{
    void perform();
}

class Meeting implements Action{
    @Override
    public void perform() {
        System.out.println("Operator is meeting clients...");
    }
}

class Orders implements Action{
    @Override
    public void perform() {
        System.out.println("Administrator is asking clients for order...");
    }
}

class Clearing implements Action{
    @Override
    public void perform() {
        System.out.println("Operator is clearing the playing setup after clients...");
    }
}

class ProvideCheque implements Action{
    @Override
    public void perform() {
        System.out.println("Administrator is providing the cheque...");
    }
}

public class Staff {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void operate(){
        action.perform();
    }
}

