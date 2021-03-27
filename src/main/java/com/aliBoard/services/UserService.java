package com.aliBoard.services;

import com.aliBoard.dao.UserDAO;
import com.aliBoard.models.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<UserProfile> fetchUserList(String status) {
        return userDAO.fetchAllByStatus(status);
    }

    public void updateUserStatus(String email, String newStatus) {
        userDAO.updateUserStatusByEmail(email, newStatus);
    }


}
