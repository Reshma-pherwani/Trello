package com.reshma.trello.service.impl;

import com.reshma.trello.exceptions.BoardNotFoundException;
import com.reshma.trello.model.Board;
import com.reshma.trello.model.BoardList;
import com.reshma.trello.model.User;
import com.reshma.trello.service.BoardService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BoardServiceImpl implements BoardService {
    Map<UUID, Board> boards;

    public BoardServiceImpl() {
        this.boards = new HashMap<>();
    }

    @Override
    public UUID createBoard(String name) {
        Board board = new Board(name);
        boards.put(board.getBoardId(), board);
        return board.getBoardId();
    }

    @Override
    public void deleteBoard(UUID boardId) throws BoardNotFoundException {
        if (boards.get(boardId) != null)
            boards.remove(boardId);
        else
            throw new BoardNotFoundException(boardId);
    }

    @Override
    public void addUsersToBoard(UUID boardId, List<User> users) {
        Board board =boards.get(boardId);
        if(board !=null)
        {
            List<User> boardUsers=board.getUsers();
            boardUsers.addAll(users);
            board.setUsers(boardUsers);
        }
        boards.put(boardId,board);
    }

    @Override
    public void showBoard(UUID boardId) {
        Board board = boards.get(boardId);
        System.out.println("Board is :" + board.getBoardId());
        board.getbList().forEach(blist ->
        {
            StringBuilder sb = new StringBuilder();
            sb.append("List name :").append(blist.getName()).append("\n");
            blist.getCards().forEach(card ->
            {
                sb.append("\n Card Name :").append(card.getCardName()).append("\n Description :")
                        .append(card.getDesc()).append(" Assigned User : ").append(
                                card.getAssignedUser() != null ? card.getAssignedUser().getUserName() : "Not Assigned"
                        );
            });
        });
    }

    @Override
    public void addListToBoard(UUID id, BoardList list) {
        Board board = boards.get(id);
        if (board != null) {
            List<BoardList> blist = board.getbList();
            blist.add(list);
            board.setbList(blist);
        }
        boards.put(id, board);

    }
}
