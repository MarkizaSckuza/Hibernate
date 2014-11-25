package DAO;

import logic.Phone;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by Margo on 19.11.2014.
 */
public interface PhoneDAO {
    public void addPhone(Phone phone) throws SQLException;
    public void updatePhone(Phone phone) throws SQLException;
    public Phone getPhoneById(int id) throws SQLException;
    public Phone getPhoneNumber(String number) throws SQLException;
    public Phone getPhoneByAdded(Date added) throws SQLException;
    public void deletePhone(Phone phone) throws SQLException;
    public List getAllPhones() throws SQLException;
}
