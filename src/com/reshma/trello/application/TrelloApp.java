package com.reshma.trello.application;

import com.reshma.trello.model.BoardList;
import com.reshma.trello.model.Card;
import com.reshma.trello.model.User;
import com.reshma.trello.service.BoardService;
import com.reshma.trello.service.impl.BoardServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class TrelloApp {
    public static void main(String args[])
    {
        User user1 = new User("u1","u1@gmail.com");
        User user2 = new User( "u2","u2@gmail.com");
        User user3 = new User( "u3","u3@gmail.com");
        User user4 = new User( "u4","u4@gmail.com");

        List<User> users = new ArrayList<>(Arrays.asList(user1,user2,user3,user4));


        // Cards
        Card card1 = new Card("Production","Smooth Release");
        card1.setAssignedUser(user1);
        Card card2 = new Card("Feature Complete","On Time");

        Card card3 = new Card("Performance","Need to optimize");
        card3.setAssignedUser(user2);

        // Lists
        BoardList bList1 = new BoardList("What went well");
        bList1.setCards(Arrays.asList(card1,card2));

        BoardList bList2 = new BoardList("What can be Improved Items");

        BoardList bList3 = new BoardList("Action Items");
        bList3.setCards(Arrays.asList(card3));




        BoardService boardServcie = new BoardServiceImpl();
        UUID id =boardServcie.createBoard("Sprint Retro");
        // Adding List to Board
        boardServcie.addListToBoard(id,bList1);
        boardServcie.addListToBoard(id,bList2);
        boardServcie.addListToBoard(id,bList3);

        // Adding users to Board
        boardServcie.addUsersToBoard(id,users);

        // Print Board
        boardServcie.showBoard(id);
    }
}
