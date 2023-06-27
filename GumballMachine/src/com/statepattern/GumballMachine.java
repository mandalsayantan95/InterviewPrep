package com.statepattern;

import lombok.Getter;


public class GumballMachine {
	
	@Getter
	State soldOutState;
	@Getter
	State noQuarterState;
	@Getter
	State hasQuarterState;
	@Getter
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public void insertQuarter() {
		 state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
	

}
