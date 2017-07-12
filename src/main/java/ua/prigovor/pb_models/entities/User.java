package ua.prigovor.pb_models.entities;


import javax.persistence.*;

/**
 * Created by Prigovor on 12.07.2017.
 */

@Entity
public class User {

    private Long id;
    private String login;
    private String password;
    private String name;
    private String patronymic;
    private String surname;
    private ContactBook contactBook;

    public User() {
    }

    public User(String login, String password,
                String name, String patronymic, String surname) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    @OneToOne(mappedBy = "user", optional = false, cascade = CascadeType.ALL)
    public ContactBook getContactBook() {
        return contactBook;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setContactBook(ContactBook contactBook) {
        this.contactBook = contactBook;
    }
}