package com.reshma.trello.service.impl;

import com.reshma.trello.exceptions.ListNotFoundException;
import com.reshma.trello.model.BoardList;
import com.reshma.trello.model.Card;
import com.reshma.trello.service.BoardListService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BoardListServiceImpl implements BoardListService {
    Map<UUID, BoardList> lists;

    public BoardListServiceImpl() {
        lists = new HashMap<>();
    }

    @Override
    public void createList(String name, UUID boardId) {
        BoardList bList = new BoardList(name);
        bList.getBoard().setBoardId(boardId);
        UUID bListID = bList.getListID();
        lists.put(bListID, bList);
    }

    @Override
    public void deleteList(UUID listId) throws ListNotFoundException {
        if (lists.get(listId) != null) {
            lists.remove(listId);
        } else
            throw new ListNotFoundException("Invalid List");
    }

    @Override
    public void addCardToList(UUID listId, Card card) {
        BoardList bList = lists.get(listId);
        if (bList != null) {
            List<Card> cards = bList.getCards();
            cards.add(card);
            bList.setCards(cards);
        }
        lists.put(listId, bList);
    }

    @Override
    public void showCard(UUID listId) {
        BoardList bList = lists.get(listId);
        System.out.println("List is : "+bList.getListID()+ " with name :" + bList.getName() + "Associated with Board :" +bList.getBoard().getBoardName()+
                " ans has cards :"+ bList.getCards().listIterator().hasNext());

    }
}
