package DAO;

import logic.PhoneBook;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookDAOImpl implements PhoneBookDAO {

    @Override
    public void addPhoneBook(PhoneBook phoneBook) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(phoneBook);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public void updatePhoneBook(PhoneBook phoneBook) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(phoneBook);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public PhoneBook getPhoneBookById(int id) throws SQLException {
        Session session = null;
        PhoneBook phoneBook = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneBook = (PhoneBook)session.load(PhoneBook.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneBook;
    }

    @Override
    public PhoneBook getPhoneNumber(String number) throws SQLException {
        Session session = null;
        PhoneBook phoneBook = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneBook = (PhoneBook)session.load(PhoneBook.class, number);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneBook;
    }

    @Override
    public PhoneBook getPhoneBookByFirst_Name(String firstName) throws SQLException {
        Session session = null;
        PhoneBook phoneBook = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneBook = (PhoneBook)session.load(PhoneBook.class, firstName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneBook;
    }

    @Override
    public PhoneBook getPhoneBookByLast_Name(String lastName) throws SQLException {
        Session session = null;
        PhoneBook phoneBook = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneBook = (PhoneBook)session.load(PhoneBook.class, lastName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneBook;
    }

    @Override
    public PhoneBook getPhoneBookByCity(String city) throws SQLException {
        Session session = null;
        PhoneBook phoneBook = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneBook = (PhoneBook)session.load(PhoneBook.class, city);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneBook;
    }

    @Override
    public void deletePhoneBook(PhoneBook phoneBook) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(phoneBook);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public List getAllPhoneBook() throws SQLException {
        Session session = null;
        List<PhoneBook> list = new ArrayList<PhoneBook>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list = session.createCriteria(PhoneBook.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return list;
    }
}
