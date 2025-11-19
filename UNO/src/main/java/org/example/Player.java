package org.example;

import java.util.List;

public class Player {

    int id;
    int name;
    List<Card> hand;

    Player(int id, int name){
        this.id = id;
        this.name = name;
    }

    void addCards(Card c){
        hand.add(c);
    }

    Card playCard(){
        //
        return new Card();
    }

    Card drawCard(Deck deck){
        if(!deck.isEmpty()){
            //draw a card from pile
            return deck.draw();
        }
        return null;
    }
}
