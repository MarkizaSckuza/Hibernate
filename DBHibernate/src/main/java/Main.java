import DAO.Factory;
import logic.Phone;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.mysql.jdbc.Driver;

/**
 * Created by Margo on 19.11.2014.
 */
public class Main {
    public static void main(String[] args) throws SQLException{

//        System.out.println(System.getProperty("java.class.path"));

        Phone phone = new Phone();
        phone.setNumber("+380631112223");
        phone.setAdded(new Date());
        phone.setDescription("normal");
        phone.setPhonebook_id(9);

     //   Factory.getInstance().getPhoneDAO().addPhone(phone);

        List<Phone> list = Factory.getInstance().getPhoneDAO().getAllPhones();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("id %3d| phbId %3d| number %15s| desc %15s| added %tT",
                    list.get(i).getId(),
                    list.get(i).getPhoneBook_id(),
                    list.get(i).getNumber(),
                    list.get(i).getDescription(),
                    list.get(i).getAdded());
        }
    }
}
