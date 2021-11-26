package com.company;

abstract class PriceList {

    public void show(Tariff tariff) {
        if (tariff.getTime() instanceof Weekdays)
            System.out.println("Weekdays Price-List:");
        else if (tariff.getTime() instanceof Weekends)
            System.out.println("Weekends Price-List:");
        showList();
    }

    public abstract void showList();
}
