package DAO;

import logic.Phone;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Margo on 19.11.2014.
 */
public class PhoneDAOImpl implements PhoneDAO {
    @Override
    public void addPhone(Phone phone) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(phone);
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
    public void updatePhone(Phone phone) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(phone);
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
    public Phone getPhoneById(int id) throws SQLException {
        Session session = null;
        Phone phone = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phone = (Phone) session.load(Phone.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phone;
    }

    @Override
    public Phone getPhoneNumber(String number) throws SQLException {
        Session session = null;
        Phone phone = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phone = (Phone) session.load(Phone.class, number);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phone;
    }

    @Override
    public Phone getPhoneByAdded(Date added) throws SQLException {
        Session session = null;
        Phone phone = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phone = (Phone) session.load(Phone.class, added);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phone;
    }

    @Override
    public void deletePhone(Phone phone) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(phone);
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
    public List getAllPhones() throws SQLException {
        Session session = null;
        List<Phone> list = new ArrayList<Phone>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list = session.createSQLQuery("select * from phone;").list();
            //list = session.createCriteria(Phone.class).list();
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
