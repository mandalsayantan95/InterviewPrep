package org.example;

import sun.security.krb5.internal.crypto.Des;

import java.util.Stack;

public class Deck {
    Stack<Card> pile;

    Deck(){
        this.pile = new Stack<>();
    }
    public void Shuffle(){

    }
    public boolean isEmpty(){
        return pile.isEmpty();
    }

    public Card draw(){
        return (!pile.isEmpty()) ?  pile.pop() : null;
    }
}
