package com.statepattern;

public class SoldOutState implements  State{

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("All Gumballs Sold OUt");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("All Gumballs Sold OUt");
    }

    @Override
    public void turnCrank() {
        System.out.println("All Gumballs Sold OUt");
    }

    @Override
    public void dispense() {
        System.out.println("All Gumballs Sold OUt");
    }
}
