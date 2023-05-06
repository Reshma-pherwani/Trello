package com.reshma.trello.exceptions;

import java.util.UUID;

public class BoardNotFoundException extends Exception {
    public BoardNotFoundException(UUID boardId) {
        super(boardId.toString());
    }
}
