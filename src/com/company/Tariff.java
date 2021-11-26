package com.company;

interface List {
    void show(Tariff tariff);
}

class Weekdays extends PriceList implements List {
    @Override
    public void show(Tariff tariff) {
        System.out.println("Showing weekdays price list to clients...");
        PriceList myMenu = new Weekdays();
        myMenu.showList();
        tariff.setTime(new Weekends());
    }

    @Override
    public void showList() {
        System.out.println("Common playground - 500 KZT/hour");
        System.out.println("Bootcamp playground - 1000 KZT/hour");
        System.out.println("VIP - 1500 KZT/hour");
        System.out.println("PS4 - 600 KZT/hour");
        System.out.println("PS5 - 1000 KZT/hour");
    }
}

class Weekends extends PriceList implements List {
    @Override
    public void show(Tariff tariff) {
        System.out.println("Showing weekends price list to clients...");
        PriceList priceList = new Weekends();
        priceList.showList();
        tariff.setTime(new Weekdays());
    }

    @Override
    public void showList() {
        System.out.println("Common playground - 700 KZT/hour");
        System.out.println("Bootcamp playground - 1300 KZT/hour");
        System.out.println("VIP - 2000 KZT/hour");
        System.out.println("PS4 - 800 KZT/hour");
        System.out.println("PS5 - 1200 KZT/hour");
    }
}

public class Tariff {
    private List list;

    Tariff(List _list){
        list = _list;
    }

    Tariff(){}

    protected void setTime(List list) {
        this.list = list;
    }
    protected List getTime() { return list; }

    public void changeTime(){
        list.show(this);
    }
}
