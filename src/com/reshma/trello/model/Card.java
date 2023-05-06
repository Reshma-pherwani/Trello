package com.reshma.trello.model;

import java.util.List;
import java.util.UUID;

public class Card {
    private UUID cardId;
    private String cardName;
    private String desc;
    private User assignedUSer;

    public Card(String cardName,String desc) {
        this.cardId = UUID.randomUUID();
        this.cardName = cardName;
        this.desc = desc;
        this.assignedUSer = null;
    }

    public UUID getCardId() {
        return cardId;
    }

    public void setCardId(UUID cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public User getAssignedUser() {
        return assignedUSer;
    }

    public void setAssignedUser(User user) {
        this.assignedUSer = user;
    }
}
