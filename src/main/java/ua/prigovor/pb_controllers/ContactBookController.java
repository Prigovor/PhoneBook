package ua.prigovor.pb_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.prigovor.pb_models.entities.ContactBook;
import ua.prigovor.pb_service.ContactBookService;

import java.util.List;

/**
 * Created by Prigovor on 13.07.2017.
 */

@Controller
public class ContactBookController {

    @Autowired
    private ContactBookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<ContactBook>> booksMap() {
        List<ContactBook> books = bookService.getUser();
        return new ResponseEntity<List<ContactBook>>(books, HttpStatus.OK);
    }
}
