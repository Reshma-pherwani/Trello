package com.reshma.trello.service;

import com.reshma.trello.exceptions.BoardNotFoundException;
import com.reshma.trello.model.BoardList;
import com.reshma.trello.model.User;

import java.util.List;
import java.util.UUID;

public interface BoardService {
    public UUID createBoard(String name);

    public void deleteBoard(UUID boardId) throws BoardNotFoundException;

    public void addUsersToBoard(UUID boardId, List<User> users);

    public void showBoard(UUID boardId);

    void addListToBoard(UUID id, BoardList bList1);
}
