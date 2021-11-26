package com.company;

import java.util.ArrayList;
import java.util.List;

interface Reserve{
    void welcome();
}

interface Reserved{
    void addClient(Reserve reserve);
    void removeClient(Reserve reserve);
    void notifyClients();
}

class Client implements Reserve{
    private String name;

    Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void welcome() {
        System.out.println("Dear, " + getName() + ", welcome to our Computer Club! :)");
    }
}

public class Service implements Reserved{
    List<String>reservedPlaces = new ArrayList<>();
    List<Reserve>reserveList = new ArrayList<>();

    public void reserve(String name){
        reservedPlaces.add(name);
    }

    public void cancel(String name){
        reservedPlaces.remove(name);
    }

    @Override
    public void addClient(Reserve reserve) {
        reserveList.add(reserve);
    }

    @Override
    public void removeClient(Reserve reserve) {
        reserveList.remove(reserve);
    }

    @Override
    public void notifyClients() {
        for (Reserve clients : reserveList)
            clients.welcome();
    }
}
