package com.reshma.trello.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Board {
    private UUID boardId;
    private String boardName;
    private String url;
    private Privacy privacy;
    List<User> users;
    List<BoardList> bList;

    public Board(String boardName) {
        this.boardId = UUID.randomUUID();
        this.boardName = boardName;
        this.url = "/boards"+boardId;
        this.privacy = Privacy.PUBLIC;
        this.users = new ArrayList<>();
        this.bList = new ArrayList<>();
    }

    public UUID getBoardId() {
        return boardId;
    }

    public void setBoardId(UUID boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Privacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<BoardList> getbList() {
        return bList;
    }

    public void setbList(List<BoardList> bList) {
        this.bList = bList;
    }
}
