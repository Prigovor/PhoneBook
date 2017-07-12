package ua.prigovor.pb_service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.prigovor.pb_dao.ContactBookDao;
import ua.prigovor.pb_models.entities.ContactBook;
import ua.prigovor.pb_service.ContactBookService;

import java.util.List;

/**
 * Created by Prigovor on 13.07.2017.
 */

@Service
public class ContactBookServiceImpl implements ContactBookService {

    @Autowired
    private ContactBookDao contactBookDao;

    @Override
    public List<ContactBook> getUser() {
        return contactBookDao.getUser();
    }
}
