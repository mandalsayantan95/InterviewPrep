package com.statepattern;


public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;
	

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		
	}

}
