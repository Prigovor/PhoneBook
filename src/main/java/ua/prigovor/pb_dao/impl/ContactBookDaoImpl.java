package ua.prigovor.pb_dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.prigovor.pb_dao.ContactBookDao;
import ua.prigovor.pb_models.entities.ContactBook;

import java.util.List;

/**
 * Created by Prigovor on 13.07.2017.
 */

@Component
public class ContactBookDaoImpl implements ContactBookDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<ContactBook> getUser() {
        Criteria criteria =
                sessionFactory.openSession().createCriteria(ContactBook.class);
        return criteria.list();
    }
}
