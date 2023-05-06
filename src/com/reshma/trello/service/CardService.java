package com.reshma.trello.service;

import com.reshma.trello.exceptions.CardNotFoundException;
import com.reshma.trello.model.User;

import java.util.UUID;

public interface CardService {
    public UUID createCard(String name, String description);

    public void deleteCard(UUID cardId) throws CardNotFoundException;

    public void showCard(UUID cardId) throws CardNotFoundException;

    public void assignUserToCard(UUID cardId, User user);

    public void unAssignUserToCard(UUID cardId, User user);

}
