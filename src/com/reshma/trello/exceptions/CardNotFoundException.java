package com.reshma.trello.exceptions;

public class CardNotFoundException extends Exception {
    public CardNotFoundException(String message)
    {
        super(message);
    }
}
