package ua.prigovor.pb_dao;

import ua.prigovor.pb_models.entities.User;

import java.util.List;

/**
 * Created by Prigovor on 12.07.2017.
 */

public interface UserDao {

    List<User> getUser();

}