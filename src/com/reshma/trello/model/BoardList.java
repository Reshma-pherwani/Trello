package com.reshma.trello.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BoardList {

    private UUID listID;
    private String name;
    private List<Card> cards;
    private Board board;

    public BoardList(String name) {
        this.listID = UUID.randomUUID();
        this.name = name;
        this.cards = new ArrayList<>();
    }

    public UUID getListID() {
        return listID;
    }

    public void setListID(UUID listID) {
        this.listID = listID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
