package ua.prigovor.pb_dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.prigovor.pb_dao.UserDao;
import ua.prigovor.pb_models.entities.User;

/**
 * Created by Prigovor on 13.07.2017.
 */

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUser() {
        Criteria criteria =
                sessionFactory.openSession().createCriteria(User.class);
        return criteria.list();
    }
}