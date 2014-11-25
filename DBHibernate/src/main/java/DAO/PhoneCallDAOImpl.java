package DAO;

import logic.PhoneCall;
import org.hibernate.Session;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhoneCallDAOImpl implements PhoneCallDAO {

    @Override
    public void addPhoneCall(PhoneCall phoneCall) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(phoneCall);
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
    public void updatePhoneCall(PhoneCall phoneCall) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(phoneCall);
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
    public PhoneCall getPhoneCallByPhoneId(String phoneId) throws SQLException {
        Session session = null;
        PhoneCall phoneCall = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneCall = (PhoneCall) session.load(PhoneCall.class, phoneId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneCall;
    }

    @Override
    public PhoneCall getPhoneCallByDT(Date dt) throws SQLException {
        Session session = null;
        PhoneCall phoneCall = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            phoneCall = (PhoneCall) session.load(PhoneCall.class, dt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen())
                session.close();
        }
        return phoneCall;
    }

    @Override
    public void deletePhoneCall(PhoneCall phoneCall) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(phoneCall);
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
    public List getAllPhoneCalls() throws SQLException {
        Session session = null;
        List<PhoneCall> list = new ArrayList<PhoneCall>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list = session.createQuery("from phonecall order by dt").list();
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
