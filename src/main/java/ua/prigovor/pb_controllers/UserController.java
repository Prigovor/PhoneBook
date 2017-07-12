package ua.prigovor.pb_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.prigovor.pb_models.entities.User;
import ua.prigovor.pb_service.UsrService;

import java.util.List;

/**
 * Created by Prigovor on 12.07.2017.
 */

@Controller
public class UserController {
    @Autowired
    private UsrService usrService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<User>> user() {
        List<User> user = usrService.getUser();
        return new ResponseEntity<List<User>>(user, HttpStatus.OK);
    }
}
