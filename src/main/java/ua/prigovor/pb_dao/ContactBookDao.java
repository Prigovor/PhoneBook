package ua.prigovor.pb_dao;

import ua.prigovor.pb_models.entities.ContactBook;

import java.util.List;

/**
 * Created by Prigovor on 13.07.2017.
 */

public interface ContactBookDao {

    List<ContactBook> getUser();

}