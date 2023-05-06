package com.reshma.trello.service.impl;

import com.reshma.trello.exceptions.CardNotFoundException;
import com.reshma.trello.model.Card;
import com.reshma.trello.model.User;
import com.reshma.trello.service.CardService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CardServiceImpl implements CardService {
    Map<UUID, Card> listOfCards;
    public CardServiceImpl() {
        listOfCards= new HashMap<>();
    }

    @Override
    public UUID createCard(String name,String description) {
        Card card= new Card(name,description);
        UUID cardId=card.getCardId();
        listOfCards.put(cardId,card);
        return cardId;
    }

    @Override
    public void deleteCard(UUID cardId) throws CardNotFoundException {
        Card card = listOfCards.get(cardId);
        if (card != null) {
            listOfCards.remove(cardId);
        } else
            throw new CardNotFoundException("Card doesn't exist");
    }

    @Override
    public void showCard(UUID cardId) throws CardNotFoundException {
        Card card = listOfCards.get(cardId);
        if(card !=null) {
            System.out.println("Card with id :" + card.getCardId() + " name : "
                    + card.getCardName() + "description :" + card.getDesc() + " is assigned to the user" + card.getAssignedUser().getUserName());
        }
        else
            throw new CardNotFoundException("Card is not present");
    }

    @Override
    public void assignUserToCard(UUID cardId, User user) {
        Card card =listOfCards.get(cardId);
        if(card !=null)
            card.setAssignedUser(user);

    }

    @Override
    public void unAssignUserToCard(UUID cardId, User user) {
        Card card =listOfCards.get(cardId);
        if(card !=null)
        {
            if(card.getAssignedUser().equals(user))
                card.setAssignedUser(null);
        }

    }
}
