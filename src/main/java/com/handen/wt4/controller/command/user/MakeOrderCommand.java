package com.handen.wt4.controller.command.user;

import com.handen.wt4.controller.command.Command;
import com.handen.wt4.controller.command.CommandResult;
import com.handen.wt4.exception.ServiceException;
import com.handen.wt4.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrderCommand implements Command {

    private static final String MAIN_PAGE = "controller?command=mainPage";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.changeStatus(Integer.valueOf(roomId), true);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
