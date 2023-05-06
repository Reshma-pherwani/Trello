package com.reshma.trello.service;

import com.reshma.trello.exceptions.ListNotFoundException;
import com.reshma.trello.model.Card;
import com.reshma.trello.model.User;

import java.util.List;
import java.util.UUID;

public interface BoardListService {
    public void createList(String name, UUID boardId);

    public void deleteList(UUID listId) throws ListNotFoundException;

    public void addCardToList(UUID lisId, Card card);

    public void showCard(UUID listId);
}
