package boot.hei.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String lastname;

    private String firstname;


    public Client() {
    }


    public Client(final String lastname, final String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }




    public String getLastname() {
        return lastname;
    }


    public void setLastname(final String nomValue) {
        lastname = nomValue;
    }


    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(final String prenomValue) {
        firstname = prenomValue;
    }
}
