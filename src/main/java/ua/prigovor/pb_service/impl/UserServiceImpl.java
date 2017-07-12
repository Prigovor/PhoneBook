package ua.prigovor.pb_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.prigovor.pb_dao.UserDao;
import ua.prigovor.pb_models.entities.User;
import ua.prigovor.pb_service.UsrService;

import java.util.List;

/**
 * Created by Prigovor on 12.07.2017.
 */

@Service
public class UserServiceImpl implements UsrService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}