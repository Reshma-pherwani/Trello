package com.reshma.trello.exceptions;

import java.util.UUID;

public class ListNotFoundException extends Exception {
    public ListNotFoundException(String  message)
    {
        super(message);
    }
}
