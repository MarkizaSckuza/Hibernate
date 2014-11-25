package DAO;

import logic.Phone;
import logic.PhoneBook;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Margo on 19.11.2014.
 */
public interface PhoneBookDAO {
    public void addPhoneBook(PhoneBook phoneBook) throws SQLException;
    public void updatePhoneBook(PhoneBook phoneBook) throws SQLException;
    public PhoneBook getPhoneBookById(int id) throws SQLException;
    public PhoneBook getPhoneNumber(String number) throws SQLException;
    public PhoneBook getPhoneBookByFirst_Name(String firstName) throws SQLException;
    public PhoneBook getPhoneBookByLast_Name(String lastName) throws SQLException;
    public PhoneBook getPhoneBookByCity(String city) throws SQLException;
    public void deletePhoneBook(PhoneBook phoneBook) throws SQLException;
    public List getAllPhoneBook() throws SQLException;
}
