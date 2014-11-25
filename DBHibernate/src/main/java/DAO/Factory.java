package DAO;

/**
 * Created by Margo on 19.11.2014.
 */
public class Factory {
    private static PhoneDAO phoneDAO = null;
    private static PhoneBookDAO phoneBookDAO = null;
    private static Factory instance = null;
    public static synchronized Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }

    public PhoneDAO getPhoneDAO() {
        if (phoneDAO == null)
            phoneDAO = new PhoneDAOImpl();
        return phoneDAO;
    }

    public PhoneBookDAO getPhoneBookDAO() {
        if (phoneBookDAO == null) {
            phoneBookDAO = new PhoneBookDAOImpl();
        }
        return phoneBookDAO;
    }
}
