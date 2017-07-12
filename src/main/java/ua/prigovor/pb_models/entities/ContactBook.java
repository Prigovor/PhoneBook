package ua.prigovor.pb_models.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Prigovor on 12.07.2017.
 */
@Entity
public class ContactBook {

    private Long id;
    private User user;
//    private List<Contact> contacts;

    public ContactBook() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    public User getUser() {
        return user;
    }

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contact_book")
//    public List<Contact> getContacts() {
//        return contacts;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public void setContacts(List<Contact> contacts) {
//        this.contacts = contacts;
//    }
}