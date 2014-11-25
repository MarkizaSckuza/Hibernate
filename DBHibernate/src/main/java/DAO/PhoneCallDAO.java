package DAO;

import logic.PhoneCall;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by Margo on 19.11.2014.
 */
public interface PhoneCallDAO {
    public void addPhoneCall(PhoneCall phoneCall) throws SQLException;
    public void updatePhoneCall(PhoneCall phoneCall) throws SQLException;
    public PhoneCall getPhoneCallByPhoneId(String phoneId) throws SQLException;
    public PhoneCall getPhoneCallByDT(Date dt) throws SQLException;
    public void deletePhoneCall(PhoneCall phoneCall) throws SQLException;
    public List getAllPhoneCalls() throws SQLException;
}
