package ua.prigovor.pb_service;

import ua.prigovor.pb_models.entities.ContactBook;

import java.util.List;

/**
 * Created by Prigovor on 13.07.2017.
 */

public interface ContactBookService {

    List<ContactBook> getUser();

}
