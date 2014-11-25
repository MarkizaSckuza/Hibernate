package logic;



import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Entity;
//import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "phone")
public class Phone {
    private int id;
    private int phonebook_id;
    private String number;
    private String type;
    private String description;
    private Date added;

    public Phone() {
    }

    @Id
//    @GenericGenerator(name = "gen", strategy = "increment")
 //   @GeneratedValue (strategy = GenerationType.AUTO)
//    @GeneratedValue(generator = "gen")
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    @Column (name = "phonebook_id")
    public int getPhoneBook_id() {
        return phonebook_id;
    }

    @Column (name = "number")
    public String getNumber() {
        return number;
    }
    @Column (name = "type")
    public String getType() {
        return type;
    }
    @Column (name = "description")
    public String getDescription() {
        return description;
    }
    @Column (name = "added")
    public Date getAdded() {
        return added;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhonebook_id(int phonebook_id) {
        this.phonebook_id = phonebook_id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAdded(Date added) {
        this.added = added;
    }
}

